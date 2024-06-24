package Queue;

public class QueueImplArray {
	static private int[] queue;
	static private int front, rear, capacity;

	public QueueImplArray(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];
	}

	static void enQueue(int data) {
		if (capacity == rear) {
			System.out.println("Queue is full!");
			return;
		}
		queue[rear++] = data;
	}

	static int deQueue() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		int result = queue[front];
		for (int i = 0; i < rear - 1; i++) {
			queue[i] = queue[i + 1];
		}

		if (rear < capacity) {
			queue[rear] = 0;
		}
		rear--;
		return result;
	}

	static void queueDisplay() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return;
		}
		for (int i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		return;
	}

	static void front() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(queue[front]);

	}
	
	public static void main(String[] args) {
		QueueImplArray queue = new QueueImplArray(4);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		queueDisplay();
		System.out.println();
		
		queue.deQueue();
		
		System.out.println();
		queueDisplay();
		
	}

}
