package linkedlist;



public class IsLLCircular {
	
	static class Node {
		private int data;
		private Node next;
		
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
	
	public static void main(String...args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		
		head.setNext(second);
		second.setNext(third);
		third.setNext(forth);
		forth.setNext(fifth);
		fifth.setNext(sixth);
//		sixth.setNext(head);
		
		isCircularList(head);
		
		
		
	}

	private static void isCircularList(Node head) {
		if(head == null) {
			System.out.print("Linked List is empty");
		}
		Node current = head.getNext();
		while(current != null) {
			if(head == current) {
				System.out.print("Linked List is circular");
				break;
			} else {
				current = current.getNext();
			}
		}
		if(current == null) {
			System.out.print("Linked List is not circular");
		}
	}

}
