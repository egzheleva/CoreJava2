package BoundedQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BoundedQueue implements Queue<Object> {
	private int size;
	private ArrayList<Object> al;

	public BoundedQueue(int size) {
		al = new ArrayList<Object>();
		this.size = size;

	}

	public boolean offer(Object element) {
		if (element != null) {
			if (al.size() == size) {
				al.remove(0);

			}
			al.add(element);
			return true;
		}
		return false;
	}

	public int getSize() {
		return al.size();
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int size() {
		return getSize();
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean contains(Object o) {
		return al.contains(o);
	}

	public Iterator iterator() {
		return al.iterator();
	}

	public Object[] toArray() {
		return al.toArray();
	}

	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		if (al.contains(o)) {
			al.remove(o);
			return true;
		}
		return false;
	}

	public boolean containsAll(Collection c) {
		return al.containsAll(c);

	}

	public boolean addAll(Collection c) {
		if (c != null) {
			al.addAll(c);
			return true;
		}
		return false;
	}

	public boolean removeAll(Collection c) {
		if (c != null && al.containsAll(c)) {
			al.removeAll(c);
			return true;
		}
		return false;
	}

	public boolean removeIf(Predicate filter) {
		if (filter != null) {
			al.removeIf(filter);
			return true;
		}
		return false;
	}

	public boolean retainAll(Collection c) {
		if (c != null) {
			al.retainAll(c);
			return true;
		}
		return false;
	}

	public void clear() {
		al.clear();

	}

	public Spliterator spliterator() {
		return al.spliterator();
	}

	public Stream stream() {
		// TODO Auto-generated method stub
		return null;
	}

	public Stream parallelStream() {
		// TODO Auto-generated method stub
		return null;
	}

	public void forEach(Consumer action) {
		// TODO Auto-generated method stub

	}

	public boolean add(Object e) {
		if (e != null) {
			al.add(e);
			return true;
		}
		return false;
	}

	public Object remove() {
		return al.remove(0);
	}

	public Object poll() {
		if (al.isEmpty()) {
			return null;
		}
		Object temp = al.get(0);
		remove();
		return temp;
	}

	public Object element() {
		return al.get(0);
	}

	public Object peek() {
		if (al.isEmpty()) {
			return null;
		}
		return element();
	}

	public void printQueue() {
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}

	public static void main(String[] args) {
		BoundedQueue lq = new BoundedQueue(4);
		lq.offer(1);
		lq.offer(2);
		lq.offer(3);
		lq.offer(4);
		lq.offer(5);
		// System.out.println(lq.getSize());
		lq.printQueue();
	}
}
