package stack;

import java.util.Stack;

public class QueueUsingStack {

	static class Queue {
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2 = new Stack<Integer>();

		static void enQueue(int x) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(x);
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}

		static int deQueue() {
			if (s1.isEmpty()) {
				return -1;
			}
			int x = s1.peek();
			s1.pop();
			return x;
		}
	};

	public static void main(String[] args) {

		Queue.enQueue(1);
		Queue.enQueue(2);
		Queue.enQueue(3);

		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());

	}

}
