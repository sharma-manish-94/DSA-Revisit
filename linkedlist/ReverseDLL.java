package linkedlist;

public class ReverseDLL {
	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		Node head = createDLL();
		printDLL(head);
		System.out.println("\nPrinting linked list in reverse order");
		reverseDLL(head);
	}

	private static void printDLL(Node head) {
		if (null == head) {
			System.out.println("Empty Linked list");
		} else {
			Node current = head;
			do {
				System.out.print(current.data+" ");
				current = current.next;
			} while (current != null);
		}
	}
	
	private static void reverseDLL(Node head) {
		if(head == null) {
			System.out.println("Empty List");
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			do {
				System.out.print(current.data+" ");
				current = current.prev;
			} while(current != null);
		}
	}

	private static Node createDLL() {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		head.next = second;

		second.next = third;
		second.prev = head;

		third.next = forth;
		third.prev = second;

		forth.next = fifth;
		forth.prev = third;

		fifth.prev = forth;

		return head;
	}

}
