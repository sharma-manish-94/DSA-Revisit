package stack;

import java.util.Stack;

public class SpecialStack_Min {

	Stack<Integer> stack;
	Integer minElement;

	public SpecialStack_Min() {
		stack = new Stack<>();
	}

	public void printMin() {
		if (stack.isEmpty()) {
			System.out.println("Empty Stack");
		} else {
			System.out.println("Min Element: " + minElement);
		}
	}

	public void push(int data) {
		if (stack.isEmpty()) {
			minElement = data;
			stack.push(data);
			System.out.println("Number inserted: " + data);
			return;
		}
		if (data < minElement) {
			stack.push(2 * data - minElement);
			minElement = data;
		} else {
			stack.push(data);
		}

		System.out.println("Number Inserted: " + data);
	}

	public void pop() {
		if (stack.isEmpty()) {
			System.out.println("Empty Stack");
			return;
		}
		System.out.println("Top Most element removed:");
		Integer t = stack.pop();
		if (t < minElement) {
			System.out.println(minElement);
			minElement = 2 * minElement - t;
		} else {
			System.out.println(t);
		}
	}

	public void peek() {
		if (stack.isEmpty()) {
			System.out.println("Empty Stack");
			return;
		}
		System.out.println("Top Most Element: ");
		Integer result = stack.peek();
		if (result < minElement) {
			System.out.println(minElement);
		} else {
			System.out.println(result);
		}

	}
	
	public static void main(String[] args) {
		SpecialStack_Min stack = new SpecialStack_Min();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printMin();
		stack.pop();
		stack.push(0);
		stack.peek();
		stack.printMin();
	}

}
