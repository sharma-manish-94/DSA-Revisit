package linkedlist;

public class ReverseLL {
	
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
		Node head = createLinkedList();
		System.out.println("Before Reversing the linked list");
		printLinkedList(head);
		head = reverseLinkedList(head);
		System.out.println("\nAfter Reversing the linked list");
		printLinkedList(head);
		
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
	
	
	private static void printLinkedList(Node head) {
		if(null == head) {
			System.out.print("Empty LinkedList");
		} else {
			Node current = head;
			while(null != current.getNext()) {
				System.out.print(current.getData()+" -> ");
				current = current.getNext();
			}
			System.out.print(current.getData());
		}
	}
	
	private static Node reverseLinkedList(Node head) {
		if(head == null) {
			System.out.println("Empty LinkedList");
			return null;
		} else {
			Node prev = head;
			Node current = head.getNext();
			Node after = head.getNext().getNext();
			prev.setNext(null);
			while(after != null) {
				current.setNext(prev);
				prev = current;
				current = after;
				after = after.getNext();
			}
			current.setNext(prev);
			return current;
		}
	}

}
