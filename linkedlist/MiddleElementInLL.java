package linkedlist;

import java.util.Vector;

class Node {
	private int data;
	private Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}

	public int getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Node node) {
		this.next = node;
	}
}

public class MiddleElementInLL {

	public static void main(String... args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		head.setNext(second);
		second.setNext(third);
		third.setNext(forth);
		forth.setNext(fifth);

		printLinkedList(head);
		printMiddleElementViaVector(head);
		printMiddleElementViaCountingElements(head);

	}

	public static void printLinkedList(Node head) {
		Node current = head;
		while (current.getNext() != null) {
			System.out.print(current.getData() + " --> ");
			current = current.getNext();
		}
		System.out.print(current.getData());

	}

	public static void printMiddleElementViaVector(Node head) {
		Vector<Integer> llVector = new Vector<>();
		Node current = head;
		while (current != null) {
			llVector.add(current.getData());
			current = current.getNext();
		}
		System.out.println("\nMiddle Element: " + llVector.get(llVector.size() / 2));
	}
	
	public static void printMiddleElementViaCountingElements(Node head) {

		int length = length(head);
		Node current = head;
		for(int i = 0; i<length/2; i++) {
			current = current.getNext();
		}
		
		System.out.println("Middle element after counting"+ current.getData());
		
		
		
	}

	private static int length(Node head) {
		int count = 0;
		if(head == null) {
			count = 0;
		}
		Node current = head;
		
		while(current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

}
