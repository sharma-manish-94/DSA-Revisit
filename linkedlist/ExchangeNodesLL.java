package linkedlist;

public class ExchangeNodesLL {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		public void setData(int data) {
			this.data = data;
		}

		public void setNext(Node node) {
			this.next = node;
		}

		public int getData() {
			return this.data;
		}

		public Node getNext() {
			return this.next;
		}
	}

	public static void main(String[] args) {
		Node head = createLinkedList();
		head = createCircularLinkedList(head);
		System.out.println(" Is Circular LinkedList: " + isCircularLinkedList(head));
		printLinkedList(head);
		System.out.println("\nAfter Swapping");
//		head = swapFirstAndLast(head);
		head = swapFirstnLast(head);
		printLinkedList(head);

	}

	private static void printLinkedList(Node head) {
		if (null == head) {
			System.out.println("Empty Linked List");
		} else {
			Node current = head;
			do {

				System.out.print(current.getData() + " ");
				current = current.getNext();
			} while (current != head);
		}

	}

	private static boolean isCircularLinkedList(Node head) {
		if (head == null) {
			return false;
		}

		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
			if (current == head) {
				return true;
			}
		}

		return false;
	}

	private static Node createCircularLinkedList(Node head) {
		if (head == null) {
			return null;
		}

		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(head);
		return head;
	}

	private static Node swapFirstAndLast(Node head) {
		if (head == null) {
			System.out.println("Empty Linked List");
		} else {
			Node current = head;
			do {
				current = current.getNext();
			} while (current.getNext() != head);
			
			int headData = head.getData();
			head.setData(current.getData());
			current.setData(headData);
		}
		return head;
	}
	
	private static Node swapFirstnLast(Node head) {
		if(head == null) {
			System.out.println("Empty Linked List");
		} else {
			Node current = head;
			while(current.getNext().getNext() != head) {
				current = current.getNext();
			}
			Node temp = current.getNext();
			current.setNext(head);
			temp.setNext(head.getNext());
			head.setNext(temp);
			head = temp;
		}
		
		return head;
	}

	private static Node createLinkedList() {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);

		head.setNext(second);
		second.setNext(third);
		third.setNext(forth);
		forth.setNext(fifth);

		return head;
	}
}
