package stack;

public class KStacks {

	static class KStack {
		int[] arr; // stores the actual data of the stack. size: n
		int[] top; // stores the indices of the top of each stack. size: k
		int[] next;

		int n, k;
		int free;

		KStack(int k, int n) {
			this.k = k;
			this.n = n;
			arr = new int[n];
			top = new int[k];
			next = new int[n];

			for (int i = 0; i < k; i++) {
				top[i] = -1;
			}

			free = 0;
			for (int i = 0; i < n - 1; i++) {
				next[i] = i + 1;
			}
			next[n - 1] = -1;
		}

		boolean isFull() {
			return (free == -1);
		}

		boolean isEmpty(int stackNum) {
			return (top[stackNum] == -1);
		}

		void push(int item, int stackNum) {
			if (isFull()) {
				System.out.println("Stack Overflow!!!");
				return;
			}

			int i = free;
			free = next[i];
			next[i] = top[stackNum];
			top[stackNum] = i;
			arr[i] = item;
		}

		int pop(int stackNum) {
			if (isEmpty(stackNum)) {
				System.out.println("Stack Underflow!!!");
				return Integer.MAX_VALUE;
			}
			int i = top[stackNum];
			top[stackNum] = next[i];
			next[i] = free;
			free = i;

			return arr[i];
		}
	}
	
	public static void main(String[] args) {
		int k = 3, n = 10;
		KStack stack = new KStack(k, n);
		stack.push(15,  2);
		stack.push(45,  2);
		
		stack.push(17,  1);
		stack.push(49,  1);
		stack.push(39,  1);
		
		
		stack.push(11,  0);
		stack.push(9,  0);
		stack.push(7,  0);
		
		System.out.println("Popped element from stack 2 is "+ stack.pop(2));
		System.out.println("Popped element from stack 1 is "+ stack.pop(1));
		System.out.println("Popped element from stack 0 is "+ stack.pop(0));
		
	}

}
