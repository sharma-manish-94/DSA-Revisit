package Queue;

public class QueueImplLL {

	static class QNode {
		int key;
		QNode next;

		public QNode(int key) {
			this.key = key;
			this.next = null;
		}
	}

	QNode front, rear;

	public QueueImplLL() {
		this.front = this.rear = null;
	}

	void enQueue(int key) {
		QNode node = new QNode(key);
		if (this.rear == null) {
			this.front = this.rear = node;
			System.out.println("Inserted Item is :" + key);
			return;
		}
		this.rear.next = node;
		this.rear = node;
		System.out.println("Inserted Item is :" + key);
	}

	void deQueue() {
		if (this.front == null) {
			return;
		}

		QNode deletedItem = this.front;
		this.front = this.front.next;
		if (this.front == null) {
			this.rear = null;
		}

		System.out.println("Deleted Item is :" + deletedItem.key);
	}

	public static void main(String[] args) {
		QueueImplLL queue = new QueueImplLL();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(40);
		queue.enQueue(50);
		queue.deQueue();

		System.out.println("Queue Front: " + (queue.front != null ? queue.front.key : -1));
	}

}
