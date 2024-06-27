package LRUCache;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class UsingQnHashing {

	private Deque<Integer> doublyQueue;
	private HashSet<Integer> hashSet;

	private final int CACHE_SIZE;

	public UsingQnHashing(int capacity) {
		doublyQueue = new LinkedList<>();
		hashSet = new HashSet<>();
		CACHE_SIZE = capacity;
	}

	public void refer(int page) {
		if (!hashSet.contains(page)) {
			if (doublyQueue.size() == CACHE_SIZE) {
				int last = doublyQueue.removeLast();
				hashSet.remove(last);
			}
		} else {
			doublyQueue.remove(page);
		}

		doublyQueue.push(page);
		hashSet.add(page);
	}

	public void display() {
		Iterator<Integer> iterator = doublyQueue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}
	
	public static void main(String[] args) {
		UsingQnHashing cache = new UsingQnHashing(4);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(4);
		cache.refer(1);
		cache.refer(4);
		cache.display();
	}
}
