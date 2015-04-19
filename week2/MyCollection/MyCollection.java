import java.util.*;

public class MyCollection {
	private ArrayList<Object> al;
	private ArrayList<Object> deletedElements;
	
	public MyCollection() {
		al = new ArrayList<Object>();
		deletedElements = new ArrayList<Object>();
	}

	public boolean add(Object o) {
		if(o != null) {
		if (al.contains(o)) {
			
			deletedElements.add(o);
			
			al.remove(o);
			//System.out.println("Equals to other element in the collection!");
			return false;
		} else {

			al.add(o);
			return true;
		} }
		return false;
	}
	public ArrayList<Object> getHelper() {
		return deletedElements;
	}
	public void print() {
		for(int i = 0 ; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
	
	public Set toSet() {
		return new HashSet<Object>(al);
	}
	
	public Object getFirst() {
		return al.get(0);
	}

	public static void main(String[] args) {
		MyCollection my = new MyCollection();
		my.add(1);
		my.add(2);
		my.add(3);
		my.print();
		my.add(2);
		my.print();

	}

}
