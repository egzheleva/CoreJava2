package Strudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {

	private String name;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public Student(String name, int grade) {
		setName(name);
		setGrade(grade);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if (grade >= 2 && grade <= 6) {
			this.grade = grade;
		}
	}


	public int compareTo(Student s) {
		if(grade != s.getGrade()) {
			return (new Integer(s.grade)).compareTo((new Integer(grade)));
		}
		return name.compareTo(s.getName());
	}

	public String toString() {
		return String.format("%s has %d", name, grade);
	}
	public static Comparator<Student> studentComparator = new Comparator<Student> () {
		public int compare(Student s1, Student s2) {
			return s1.compareTo(s2);
		}
	};
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Eli", 6);
		Student s2 = new Student("Marsi", 6);
		Student s3 = new Student("Lqlq", 4);
		Student s4 = new Student("Lq", 5);
		Student s5 = new Student("A", 6);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.sort(studentComparator);
		for(Student s : students) {
			System.out.println(s);
		}
		
	}

}
