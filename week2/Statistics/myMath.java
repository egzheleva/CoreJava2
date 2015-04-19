package Statistics;

import java.util.*;

public class myMath implements Statistics {

	private ArrayList<Integer> al;

	private void userInput() {
		al = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		String input = scanner.nextLine();
		al.add(Integer.parseInt(input));
		while (true) {
			System.out.println("Enter number: ");
			input = scanner.nextLine();
			if (input.equals("stop")) {
				break;
			}

			al.add(Integer.parseInt(input));
		}

	}

	public myMath() {
		userInput();
	}

	public double getMean() {
		int sum = 0;
		for (Integer i : al) {
			sum += i;
		}
		return sum / al.size();
	}

	public double getMedian() {
		Collections.sort(al);
		return (al.size() + 1) / 2;
	}

	private int timesContains(Integer n, ArrayList<Integer> al) {
		int times = 0;
		for (Integer i : al) {
			if (n == i) {
				times++;
			}
		}
		return times;

	}

	public int getMode() {
		int maxContaining = 0;
		Integer max = 0;
		for (Integer i : al) {
			if (timesContains(i, al) > maxContaining) {
				maxContaining = timesContains(i, al);
				max = i;
			}
		}
		return max;
	}

	public int getRange() {
		Collections.sort(al);
		return al.get(al.size() - 1) - al.get(0);
	}

	public Iterator<Integer> iterator() {
		return al.iterator();
	}

	public static void main(String[] args) {
		myMath math = new myMath();
		System.out.println(math.getMode());
		System.out.println(math.getMedian());
		System.out.println(math.getRange());	
		System.out.println(math.getMean());
	}

}
