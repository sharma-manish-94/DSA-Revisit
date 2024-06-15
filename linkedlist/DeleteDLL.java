package linkedlist;

public class DeleteDLL {

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}

	private static Node createLL() {

		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		
		head.next = second;

		second.prev = head;
		second.next = third;

		third.prev = second;
		third.next = forth;

		forth.prev = third;
		forth.next = fifth;

		fifth.prev = forth;
		fifth.next = sixth;

		sixth.prev = fifth;

		return head;
	}

	private static Node deleteLL(Node head, Node node) {
		if (head == null || node == null) {
			return head;
		}
		

	}
	
	private static void printLinkedList(Node head) {
		if(head == null) {
			System.out.println("Empty Linked List");
		} else {
			while(head != null) {
				System.out.print(head.data+" ");
				head = head.next;
			}
		}
	}

	public static void main(String[] args) {
		Node head = createLL();
		printLinkedList(head);
//		Node head = deleteLL();
//		printLinkedList(head);
	}
}
