package MyLinkedList;

public interface LinkedListInterface {
	public boolean isEmpty();
	public void addFirst(int value);
	public void addLast(int value);
	public int deleteFirst();
	public int deleteLast();
	public int size();
	public boolean addAfter(int key, int value);
	public void deleteAfter(int key);
}
