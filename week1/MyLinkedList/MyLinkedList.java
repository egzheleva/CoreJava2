package MyLinkedList;

public class MyLinkedList implements LinkedListInterface {
	private Node first;
	private Node last;

	private class Node {
		private int value;
		private Node previous;
		private Node next;

		public Node(int v) {
			value = v;
		}
	}

	public MyLinkedList() {
		first = null;
		last = null;

	}

	public boolean isEmpty() {
		return first == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			last = newNode;
		} else {

			first.previous = newNode;
		}
		newNode.next = first;
		first = newNode;
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}

	public int deleteFirst() {
		int deletedValue = 0;
		if (!isEmpty()) {
			first.previous = null;
			deletedValue = first.value;
			first = first.next;
			first.previous = null;
		}
		return deletedValue;
	}

	public int deleteLast() {
		int deleted = 0;
		if (!isEmpty()) {
			deleted = last.value;
			last.next = null;
			last = last.previous;
			last.next = null;
		}
		return deleted;

	}

	public void deleteAfter(int key) {
		Node current = first;
		while (current.value != key) {
			current = current.next;
		}
		current.next = current.next.next;
		current.next.next.previous = current;
		current.next.previous = null;
		current.next.next = null;
	}

	public boolean addAfter(int key, int value) {
		Node current = first;
		while (current.value != key) {
			if (current == null) {
				return false;
			}
			current = current.next;
		}
		Node newNode = new Node(value);
		if (current == last) {
			newNode.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;

			current.next.previous = newNode;
		}
		newNode.previous = current;
		current.next = newNode;
		return true;

	}

	public int size() {

		int count = 0;
		while (first.next != null) {
			first = first.next;
			count++;

		}
		return count;
	}
}
