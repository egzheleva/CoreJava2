package Exceptions;

public class DatabaseCorruptedException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -445503031347068323L;

	public DatabaseCorruptedException(String message) {
		super(message);
	}

}
