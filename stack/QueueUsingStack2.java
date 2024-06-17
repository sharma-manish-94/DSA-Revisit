package stack;

import java.util.Stack;

public class QueueUsingStack2 {
	static class Queue {
		static Stack<Integer> stack1 = new Stack<Integer>();
		static Stack<Integer> stack2 = new Stack<Integer>();

		private static void enQueue(int data) {
			stack1.push(data);

		}

		private static int deQueue() {
			if (stack1.isEmpty() && stack2.isEmpty()) {
				return -1;
			}
			if (stack2.isEmpty()) {
				while (!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
			}
			int result = stack2.pop();

			return result;
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

}
