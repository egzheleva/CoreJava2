import java.awt.List;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class week2 {
	public static boolean check(String brackets) {
		Stack stack = new Stack();
		char[] list = brackets.toCharArray();
		for (char c : list) {
			if (c == '(') {
				stack.push(c);

			}
			if (c == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();

			}
		}
		return stack.isEmpty();
	}

	public static void reverse(Collection<Integer> collection) {
		Stack<Integer> stack = new Stack<Integer>();
		for (Integer i : collection) {
			stack.push(i);
		}
		collection.clear();
		while (!stack.empty()) {
			collection.add(stack.pop());
		}
	}

	public static Collection<Object> rotate(Collection<Object> collection,
			int rotateStep) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.addAll(collection);

		collection.clear();
		if (rotateStep > 0) {
			while (rotateStep-- != 0) {

				Object element = list.get(list.size() - 1);

				list.remove(list.size() - 1);
				list.add(0, element);

			}

		} else if (rotateStep < 0) {
			while (rotateStep++ != 0) {

				Object element = list.pop();
				list.add(element);

			}
		}
		collection.addAll(list);
		return collection;

	}

	public static Integer uniqueElements(Collection<Integer> collection) {
		MyCollection result = new MyCollection();
		for (Integer i : collection) {
			result.add(i);
		}
		Set<Integer> first = result.toSet();
		Set<Integer> second = new HashSet(result.getHelper());
		first.removeAll(second);
		Object[] list = first.toArray();
		return (Integer) list[0];

	}

	public Set findDuplicates(Set<Integer> A, Set<Integer> B, Set<Integer> C) {
		Set<Integer> result = new HashSet<Integer>(A);
		result.retainAll(B);
		result.retainAll(C);
		return result;
	}

	// zad 10

	public String hashMapRepresending(
			HashMap<? extends Object, ? extends Object> hm) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");

		for (Map.Entry<? extends Object, ? extends Object> entry : hm
				.entrySet()) {
			sb.append(entry.getKey());
			sb.append(":");
			sb.append(entry.getValue());
			sb.append(",");
			
			
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append("}");
		return sb.toString();

	}
	//zad11
	
	private int countWord(String word, String sentence) {
		int count = 0;
		String[] sentenceList = sentence.split(" ");
		for(String s : sentenceList) {
			if(s.equals(word)) {
				count++;
			}
		}
		return count;
	}
	
	public Map<String, Integer> countingWords(String sentence) {
		Map<String, Integer> result = new HashMap<String, Integer>();
		String[] sentenceList = sentence.split(" ");
		for(String s : sentenceList) {
			result.put(s, countWord(s, sentence));
		}
		return result;
	}

	public static void main(String[] args) {
		// System.out.println(check("()(()()()))"));
		week2 lqlq = new week2();
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(4);
		al.add(6);
		al.add(7);
		al.add(6);
		al.add(6);
		al.add(6);
		al.add(4);

		// System.out.println(lqlq.uniqueElements(al));

		// for(int i = 0; i < al.size(); i ++) {
		// System.out.println(al.get(i));

		// }

		/*
		 * System.out.println("My List : " + al);
		 * System.out.println("\nHere are the duplicate elements from list : " +
		 * uniqueElements(al));
		 * 
		 * Set<Integer> A = new HashSet<Integer>(); Set<Integer> B = new
		 * HashSet<Integer>(); Set<Integer> C = new HashSet<Integer>();
		 * A.add(2); A.add(3); B.add(2); C.add(2);
		 * System.out.println(lqlq.findDuplicates(A, B, C).toString());
		 */

		LinkedList l = new LinkedList();
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		// System.out.println(l.pop());
		// l.push(6);
		// System.out.println(l.pop());

		Collection<Object> newL = rotate(l, -1);
		for (Object o : newL) {
			System.out.println(o);
		}
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(2, 3);
		hm.put(4,5);
		hm.put(6, 7);
		

		System.out.println(lqlq.hashMapRepresending(hm));
		
		System.out.println(lqlq.countWord("lqlq", "lqlq lqlq az"));
		Map<String, Integer> elka = new HashMap();
		elka = lqlq.countingWords("Elka is Elka is qka");
		System.out.println(elka);
		
	}
}
