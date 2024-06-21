package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQ {

	Queue<Integer> queue = new LinkedList<Integer>();

	void push(int data) {
		int size = queue.size();
		queue.add(data);

		for (int i = 0; i < size; i++) {
			queue.add(queue.remove());
		}
	}

	int pop() {
		if (queue.isEmpty()) {
			System.out.println("Empty Stack");
			return -1;
		}
		return queue.remove();
	}

	int top() {
		if (queue.isEmpty()) {
			return -1;
		}
		return queue.peek();
	}

	boolean isEmpty() {
		return queue.isEmpty();
	}

	public static void main(String[] args) {
		StackUsingOneQ stack = new StackUsingOneQ();
		stack.push(10);
		stack.push(20);
		System.out.println("Top Element: " + stack.top());
		stack.pop();
		stack.push(30);
		stack.pop();
		System.out.println("Top Element: " + stack.top());

	}

}
