package Exceptions;

import java.util.ArrayList;

public class DatabaseCorrupted {

	private ArrayList<User> users;

	public DatabaseCorrupted(User user) {
		users = new ArrayList<User>();
	}

	public void add(User name) {

		if (name.getUsername().isEmpty()) {
			throw new DatabaseCorruptedException("The name cannot be empty!");
		} else {
			users.add(name);
		}
		System.out.println("Done!");
	}

	public static void main(String[] args) {

		User user = new User("e");
		DatabaseCorrupted c = new DatabaseCorrupted(user);
		c.add(user);

	}

}
