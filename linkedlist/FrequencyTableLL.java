package linkedlist;

import java.util.HashMap;
import java.util.Map;

class NodeLL {
	private int data;
	private NodeLL next;

	public NodeLL() {
	}

	public NodeLL(int data) {
		this.data = data;
		this.next = null;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(NodeLL node) {
		this.next = node;
	}

	public int getData() {
		return this.data;
	}

	public NodeLL getNext() {
		return this.next;
	}

}

public class FrequencyTableLL {
	public static void main(String... args) {
		NodeLL head = new NodeLL(1);
		NodeLL second = new NodeLL(2);
		NodeLL third = new NodeLL(1);
		NodeLL forth = new NodeLL(2);
		NodeLL fifth = new NodeLL(1);
		NodeLL sixth = new NodeLL(3);
		NodeLL seventh = new NodeLL(1);

		head.setNext(second);
		second.setNext(third);
		third.setNext(forth);
		forth.setNext(fifth);
		fifth.setNext(sixth);
		sixth.setNext(seventh);

		System.out.println("Frequency Of 1 Using Hash: " + findFrequencyUsingHash(1, head));
		System.out.println("Frequency Of 2 Using Counter: " + findFrequencyUsingCount(2, head));
	}

	public static int findFrequencyUsingHash(int key, NodeLL head) {
		Map<Integer, Integer> frequencyTable = new HashMap<>();
		if (head == null) {
			return 0;
		}

		while (head != null) {
			frequencyTable.put(head.getData(), frequencyTable.getOrDefault(head.getData(), 0) + 1);
			head = head.getNext();
		}

		return frequencyTable.getOrDefault(key, 0);

	}

	public static int findFrequencyUsingCount(int key, NodeLL head) {
		if (head == null) {
			return 0;
		}

		int count = 0;
		while (head != null) {
			if (key == head.getData()) {
				count++;
			}
			head = head.getNext();
		}
		return count;
	}

}
