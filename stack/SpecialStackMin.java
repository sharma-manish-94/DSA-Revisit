package stack;

import java.util.Stack;

public class SpecialStackMin {

	Stack<Node> stack;

	class Node {
		int val;
		int min;

		public Node(int val, int min) {
			this.val = val;
			this.min = min;
		}
	}

	public SpecialStackMin() {
		this.stack = new Stack<Node>();
	}

	public void push(int data) {
		if (stack.isEmpty()) {
			this.stack.push(new Node(data, data));
		} else {
			int min = Math.min(data, this.stack.peek().min);
			this.stack.push(new Node(data, min));
		}
	}

	public int pop() {
		return this.stack.pop().val;
	}

	public int top() {
		return this.stack.peek().val;
	}

	public int getMin() {
		return this.stack.peek().min;
	}
	
	public static void main(String[] args) {
		SpecialStackMin stack = new SpecialStackMin();
		stack.push(-1);
		stack.push(10);
		stack.push(-4);
		stack.push(0);
		
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
	}
}
