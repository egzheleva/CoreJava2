package myStack;

import java.util.Arrays;

public class StackImpl implements StackInterface {
	private int size = 0;
	private Object[] elements;
	private int capacity = 5;

	public StackImpl() {
		elements = new Object[capacity];
	}

	public Object getHead() {
		return elements[size];
	}

	public int getSize() {
		return size;
	}

	public void push(Object obj) {
		if (!isDuplicated(obj)) {
			if (size == elements.length) {
				doubleCapacity();
			}
			size++;
			elements[size] = obj;
		} else
			System.out.println("Element is duplicated! Please push other!");
	}

	public Object pop() {
		Object last = elements[size];
		size--;
		return last;
	}

	private void doubleCapacity() {
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}

	private boolean isDuplicated(Object obj) {
		boolean flag = false;

		for (Object o : elements) {
			if (obj.equals(o)) {
				flag = true;

			}
		}

		return flag;

	}

	public static void main(String args[]) {
		StackImpl stack = new StackImpl();
		// System.out.println(stack.getSize());
		stack.push(4);
		stack.push(3);
		// System.out.println(stack.getSize());
		stack.push(10);
		// System.out.println(stack.getSize());
		// System.out.println(stack.pop());
		// System.out.print(stack.getSize());

		System.out.println(stack.getHead());

		stack.push(4);
		System.out.print(stack.getSize());
	}
}
