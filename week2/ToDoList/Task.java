package ToDoList;

import java.util.Comparator;

public class Task implements Comparable<Task> {

	private int priority;
	private int timeToFinish;

	public Task(int priority) {
		this.priority = priority;
	}

	public Task() {

	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getTimeToFinish() {
		return timeToFinish;
	}

	public void setTimeToFinish(int timeToFinish) {
		this.timeToFinish = timeToFinish;
	}

	public int compareTo(Task o) {
		return this.priority - o.priority;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
