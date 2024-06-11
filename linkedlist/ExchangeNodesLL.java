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
		boolean isCircular = isCircularLinkedList(head);
	}

	private static boolean isCircularLinkedList(Node head) {
		// implement the logic here
		return false;
	}

	private static Node createCircularLinkedList(Node head) {
		if(head == null) {
			return null;
		}
		
		Node current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(head);
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
