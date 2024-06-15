package stack;

public class StackImplUsingLL {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		if (null == root) {
			return true;
		}
		return false;
	}

	public void push(int data) {
		StackNode node = new StackNode(data);
		if (null == root) {
			root = node;
		} else {
			node.next = root;
			root = node;
		}
		System.out.println(data + " pushed to stack");
	}

	public int pop() {
		if (null == root) {
			System.out.println("Empty Stack");
			return 0;
		}
		int poppedData = root.data;
		root = root.next;
		return poppedData;
	}

	public int peek() {
		if (null == root) {
			System.out.println("Empty Stack");
			return 0;
		}
		return root.data;
	}

	public void print() {
		if (null == root) {
			System.out.println("Empty Stack");
			return;
		}
		StackNode current = root;
		while (current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		StackImplUsingLL stack = new StackImplUsingLL();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		stack.print();

		System.out.println("\nTop element of stack: " + stack.peek());

		System.out.println("Popping element of the stack");

		stack.pop();

		System.out.println("Top element of stack: " + stack.peek());
		
		System.out.println("\nPrinting all elements of the stack");
		stack.print();

	}

}
