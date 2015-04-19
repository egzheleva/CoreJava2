package ToDoList;

import java.util.PriorityQueue;

public class ToDoList {

	private PriorityQueue<Task> pq;
	private int hoursRemaining;

	
	public ToDoList(int hoursRemaining) {
		pq = new PriorityQueue<Task>();
		this.hoursRemaining = hoursRemaining; 
	}
	void addTask(Task t) {
		pq.add(t);
	}

	void markFinished(Task t) {
		hoursRemaining -= t.getTimeToFinish();
	}

	void markCancelled(Task t) {
		//mestish gi na drugo mqsto i gi mahash ot opashkata
	}

	Task getTop() {
		return pq.peek();
	}

	boolean canFinish() {
		int allTime = 0;
		for(Task t : pq) {
			allTime += t.getTimeToFinish();
		}
		return allTime < hoursRemaining;
	}

	int getRemainigTime() {
		return hoursRemaining;
	}


	public void setHoursRemaining(int hoursRemaining) {
		this.hoursRemaining = hoursRemaining;
	}
	
	public static void main(String[] args) {
		ToDoList todo = new ToDoList(11); //11 hours remaining!
		todo.addTask(new Task(10)); //maximum priority!
		todo.addTask(new Task(5)); //default priority, smaller than 10
		todo.addTask(new Task(1));  //default priority, smaller than 10
		todo.addTask(new Task(3)); //straight 8 hours, of course!

		if (todo.canFinish()){
		    System.out.println("Woohoo!");
		} else {
		    System.out.println("I am ...screwed :(");
		}

		System.out.println(todo.getTop()); //StudyForAlgebraTask
	}

}
