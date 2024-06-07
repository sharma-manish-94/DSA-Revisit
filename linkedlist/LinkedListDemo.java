package linkedlist;

class LLNode {
	private int data;
	private LLNode next;
	
	public LLNode() {
		this.data = 0;
		this.next = null;
	}
	
	public LLNode(int data) {
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public LLNode getNext() {
		return this.next;
	}
	
	public void setNext(LLNode next) {
		this.next = next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
}

public class LinkedListDemo {
	
	public static void main(String...args) {
		// create a linked list with 5 nodes 4, 2, 1,5, 4
		LLNode head = new LLNode(4);
		LLNode second = new LLNode(2);
		LLNode third = new LLNode(1);
		LLNode fourth = new LLNode(5);
		LLNode fifth = new LLNode(4);
		
		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		
		System.out.println("Original LinkedList");
		printLinkedList(head);
		
		System.out.println("\nAfter inserting at the beginning");
		head = insertAtTheBeginning(head, 8);
		printLinkedList(head);
		
		System.out.println("\nAfter inserting at the end");
		insertAtTheEnd(head, 9);
		printLinkedList(head);
		
		System.out.println("\nAfter inserting at a position");
		insertAtAPosition(head, 11, 4);
		printLinkedList(head);
		
		System.out.print("\nMiddle element of a linked list: ");
		System.out.print(middleElement(head).getData());
		
	}
	
	public static void printLinkedList(LLNode head) {
		if(head == null) {
			System.out.print("Empty LinkedList");
		}
		
		LLNode current = head;
		while(current.getNext() != null) {
			System.out.print(current.getData()+" --> ");
			current = current.getNext();
		}
		System.out.print(current.getData());
		
	}
	
	public static LLNode insertAtTheBeginning(LLNode head, int data) {
		LLNode dataNode = new LLNode(data);
		if(head == null) {
			head = dataNode;
		} else {
			dataNode.setNext(head);
			head = dataNode;
		}
		return head;
	}
	
	public static LLNode insertAtTheEnd(LLNode head, int data) {
		LLNode dataNode = new LLNode(data);
		if(head == null) {
			head = dataNode;
		} else {
			LLNode current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(dataNode);
		}
		return head;
	}
	
	public static int length(LLNode head) {
		int length = 0;
		if(head == null) {
			return length;
		}
		
		while(head != null) {
			length ++;
			head = head.getNext();
		}
		return length;
	}
	
	public static LLNode insertAtAPosition(LLNode head, int data, int position) {
		int length = length(head);
		if (0 <= position && position <= length) {
			LLNode current = head;
			LLNode dataNode = new LLNode(data);
			int pos = 0;
			while (pos < position - 1) {
				current = current.getNext();
				pos++;
			}
			LLNode nextPosition = current.getNext();
			current.setNext(dataNode);
			dataNode.setNext(nextPosition);

		} else {
			System.out.println("Invalid Position for insertion");
		}
		return head;
	}
	
	public static LLNode middleElement(LLNode head) {
		LLNode slow = head;
		LLNode fast = head;
		while(fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		
		return slow;
	}

}
