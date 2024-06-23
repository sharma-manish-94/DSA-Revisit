package stack;

import java.util.ArrayList;
import java.util.List;

public class CustomDS {
	static class Pair {
		int element;
		int minElement;

		public Pair(int element, int minElement) {
			this.element = element;
			this.minElement = minElement;
		}
	}

	int min;
	List<Pair> stack = new ArrayList<>();

	public CustomDS() {
		this.min = Integer.MAX_VALUE;
	}

	void addElement(int data) {
		if (stack.size() == 0 || data < min) {
			min = data;
		}
		Pair pair = new Pair(data, min);
		stack.add(pair);
		System.out.println(data + " inserted successfully");
	}

	int getLastElement() {
		if (stack.size() == 0) {
			System.out.println("Underflow Error !");
			return -1;
		}
		return stack.get(stack.size() - 1).element;
	}

	void removeLastElement() {
		if (stack.size() == 0) {
			System.out.println("Underflow Error");
		} else if (stack.size() > 1) {
			min = stack.get(stack.size() - 2).minElement;
		} else {
			min = Integer.MAX_VALUE;
		}
		stack.remove(stack.size() - 1);
		System.out.println("removed successfully");
	}

	int getMin() {
		if (stack.size() == 0) {
			System.out.println("Underflow Error");
			return -1;
		}
		return stack.get(stack.size() - 1).minElement;
	}

	public static void main(String[] args) {
		CustomDS newStack = new CustomDS();
		newStack.addElement(5);
		newStack.addElement(7);
		newStack.addElement(3);
		System.out.println("min element :: " + newStack.getMin());
		newStack.removeLastElement();
		newStack.addElement(2);
		newStack.addElement(9);
		System.out.println("last element :: " + newStack.getLastElement());
		newStack.addElement(0);
		System.out.println("min element :: " + newStack.getMin());
		newStack.removeLastElement();
		newStack.addElement(11);
		System.out.println("min element :: " + newStack.getMin());
	}
}
