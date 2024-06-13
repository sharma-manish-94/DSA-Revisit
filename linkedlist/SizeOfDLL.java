package linkedlist;

public class SizeOfDLL {

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			prev = next = null;
		}
	}

	public static void main(String[] args) {
		Node head = createDLL();
		System.out.println("Size of Doubly linked list: " + sizeOfDLL(head));
	}

	private static Node createDLL() {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		head.next = second;
		second.prev = head;
		second.next = third;

		third.prev = second;
		third.next = forth;

		forth.prev = third;
		forth.next = fifth;

		fifth.prev = forth;

		return head;

	}

	private static int sizeOfDLL(Node head) {
		if (head == null) {
			return 0;
		}
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
}
