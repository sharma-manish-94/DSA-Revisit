package Queue;

public class KQueues {

	int numberOfQueues;
	int numberOfElements;
	int[] originalArray;
	int[] front;
	int[] rear;
	int[] next;
	int free;

	KQueues(int k, int n) {
		this.numberOfQueues = k;
		this.numberOfElements = n;
		this.originalArray = new int[n];
		this.front = new int[k];
		this.rear = new int[k];
		this.next = new int[n];

		for (int i = 0; i < k; i++) {
			front[i] = rear[i] = -1;
		}
		free = 0;
		for (int i = 0; i < n - 1; i++) {
			next[i] = i + 1;
		}
		next[n - 1] = -1;
	}

	private boolean isEmpty(int i) {
		return front[i] == -1;
	}

	private boolean isFull(int i) {
		return free == -1;
	}

	private void enqueue(int data, int i) {
		if (isFull(i)) {
			System.out.println("queue overflow!");
			return;
		}

		int nextFree = next[free];
		if (isEmpty(i)) {
			rear[i] = front[i] = free;
		} else {
			next[rear[i]] = free;
			rear[i] = free;
		}
		next[free] = -1;
		originalArray[free] = data;
		free = nextFree;
	}

	private int dequeue(int i) {
		if (isEmpty(i)) {
			System.out.println("Stack underflow");
			return Integer.MIN_VALUE;
		}

		int frontIndex = front[i];
		front[i] = next[frontIndex];
		next[frontIndex] = free;
		free = frontIndex;

		return originalArray[frontIndex];
	}

	public static void main(String[] args) {
		int k = 3, n = 10;
		KQueues kQueues = new KQueues(k, n);
		kQueues.enqueue(15, 2);
		kQueues.enqueue(45, 2);
		kQueues.enqueue(17, 1);
		kQueues.enqueue(49, 1);
		kQueues.enqueue(39, 1);

		kQueues.enqueue(11, 0);
		kQueues.enqueue(9, 0);
		kQueues.enqueue(7, 0);

		System.out.println("Dequeued element from queue 2 is " + kQueues.dequeue(2));
		System.out.println("Dequeued element from queue 1 is " + kQueues.dequeue(1));
		System.out.println("Dequeued element from queue 0 is " + kQueues.dequeue(0));
	}

}
