package stack;

public class StackImplementation {

	static class Stack {
		static int MAX = 1000;
		int top;
		int[] stack = new int[MAX];

		Stack() {
			top = -1;
		}

		private boolean isEmpty() {
			return top < 0;
		}

		private boolean isFull() {
			return top == MAX;
		}

		private boolean push(int data) {
			if (top >= (MAX - 1)) {
				System.out.println("Full Stack");
				return false;
			} else {
				stack[++top] = data;
				System.out.println(data + " pushed to stack");
				return true;
			}
		}

		private int pop() {
			if (top < 0) {
				System.out.println("Empty Stack");
				return 0;
			} else {
				return stack[top--];
			}
		}

		private int peek() {
			if (top < 0) {
				System.out.println("Empty Stack");
				return 0;
			}
			return stack[top];
		}

		private void print() {
			for (int i = top; i > -1; i--) {
				System.out.print(" " + stack[i]);
			}
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		System.out.println("Original Stack");
		stack.print();

		System.out.println("\nAfter deleting 1 element");
		stack.pop();
		stack.print();

		System.out.print("\nTop Element After deletion: ");
		System.out.println(stack.peek());
	}

}
