package linkedlist;

public class InsertionLL {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {
		Node head = insertIntoLinkedList(1, 0, null);
		head = insertIntoLinkedList(2, 1, head);
		head = insertIntoLinkedList(3, 2, head);
		head = insertIntoLinkedList(4, 2, head);
		
		printLinkedList(head);

	}

	private static void printLinkedList(Node head) {
		if(null == head) {
			System.out.println("Empty Linked List");
		} else {
			do {
				System.out.print(head.data+" ");
				head = head.next;
			} while(head.next != null);
		}
		
	}

	private static Node insertIntoLinkedList(int data, int pos, Node head) {
		int length = length(head);
		if (pos < 0 || pos > length) {
			System.out.println("Failed to insert element. Insertion position is invalid");
		}
		if (pos == 0) {
			head = insertAtTheFront(head, data);
		} else if (pos == length) {
			head = insertAtTheEnd(head, data);
		} else {
			head = insertAtPosition(head, data, pos);
		}
		return head;
	}

	private static Node insertAtPosition(Node head, int data, int pos) {
		Node newNode = new Node(data);
		int count = 0;
		Node current = head;
		while(count < pos - 1) {
			current = current.next;
		}
		newNode.next = current.next.next;
		current.next = newNode;
		return head;
	}

	private static Node insertAtTheEnd(Node head, int data) {
		Node newNode = new Node(data);
		Node current = head;
		while(current != null) {
			current = current.next;
		}
		
		current = newNode;
		return head;
	}

	private static Node insertAtTheFront(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}

	private static int length(Node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

}
