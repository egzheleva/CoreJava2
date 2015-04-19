package BoundedQueue;

import java.util.ArrayList;
import java.util.Queue;
import java.util.stream.Stream;

public class myQueue extends ArrayList<Object> implements Queue<Object> {

	int size;

	public myQueue(int size) {
		this.size = size;
	}
	
	public boolean offer(Object element) {

		if (element != null) {
			if (super.size() == size) {
				super.remove(0);

			}
			super.add(element);
			return true;
		}
		return false;
	}

	public Stream stream() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream parallelStream() {
		// TODO Auto-generated method stub
		return null;
	}



	public Object remove() {
		return super.remove(0);
	}

	public Object poll() {
		if (super.isEmpty()) {
			return null;
		}
		Object temp = super.get(0);
		remove();
		return temp;
	}

	public Object element() {
		return super.get(0);
	}

	public Object peek() {
		if (super.isEmpty()) {
			return null;
		}
		return element();
	}
	
	public void printQueue() {
		for (int i = 0; i < super.size(); i++) {
			System.out.println(super.get(i));
		}

	}

	public static void main(String[] args) {
		myQueue lq = new myQueue(3);
		lq.offer(1);
		lq.offer(2);
		lq.offer(3);
		lq.offer(4);
		lq.offer(5);
		// System.out.println(lq.getSize());
		lq.printQueue();
		System.out.println(lq.peek());
		System.out.println("");
		lq.offer(6);
		System.out.println(lq.peek());

	}

}
