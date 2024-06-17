package stack;

import java.util.Stack;

public class SpecialStack extends Stack<Integer> {

	private Stack<Integer> minStack = new Stack<>();

	public void push(int data) {
		if (super.empty()) {
			super.push(data);
			minStack.push(data);
		} else {
			super.push(data);
			if (minStack.peek() > data) {
				minStack.push(data);
			}
		}
	}

	public Integer pop() {
		int result = super.pop();
		if (result == minStack.peek()) {
			minStack.pop();
		}
		return result;
	}
	
	public Integer getMin() {
		if(minStack.isEmpty()) {
			return -1;
		}
		return minStack.peek();
	}
	
	public static void main(String[] args) {
		SpecialStack stack = new SpecialStack();
		stack.push(1);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(0);
		
		
		System.out.println("Minimum Element: "+ stack.getMin());
		stack.pop();
		System.out.println("Minimum Element: "+ stack.getMin());
		
		
	}

}
