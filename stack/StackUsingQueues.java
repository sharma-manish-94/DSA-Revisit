package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	static class Stack {
		static Queue<Integer> q1 = new LinkedList<Integer>();
		static Queue<Integer> q2 = new LinkedList<Integer>();
		static int currSize;

		static void push(int data) {
			q2.add(data);
			while (!q1.isEmpty()) {
				q2.add(q1.remove());
			}
			Queue<Integer> q = q1;
			q1 = q2;
			q2 = q;
		}

		static void pop() {
			if (q1.isEmpty()) {
				return;
			}
			q1.remove();
		}

		static int top() {
			if (q1.isEmpty()) {
				return -1;
			}
			return q1.peek();
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
	}

}
