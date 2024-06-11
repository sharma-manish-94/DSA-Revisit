package linkedlist;

public class CountNodesInLL {
	
	static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
		public void setNext(Node node) {
			this.next = node;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public int getData() {
			return this.data;
		}
		
		public Node getNext() {
			return this.next;
		}
	}
	
	public static void main(String...args) {
		Node head = createLinkedList();
		System.out.println("Number Of Nodes: "+ countNodes(head));
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
//		for empty linked list
//		return null;
	}
	
	private static int countNodes(Node head) {
		if(head == null) {
			return 0;
		}
		int result = 0;
		do {
			result++;
			head = head.getNext();
		} while(head != null);
		return result;
	}

}
