package linkedlist;

public class PrintReverseLL {

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

	private static void printInReverse(Node head) {
		if (head == null) {
			return;
		}

		printInReverse(head.next);
		System.out.print(head.data + " ");

	}

	private static void printInOrder(Node head) {
		if (head == null) {
			return;
		}
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	public static void main(String[] args) {
		Node head = createLinkedList();
		System.out.println("Reverse Order");
		printInReverse(head);
		System.out.println("\nInorder");
		printInOrder(head);
	}

}
