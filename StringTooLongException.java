/**
 * This class contains a custom exception that is thrown when a string is
 * longer than a specified length.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Exception Handling Project
 * Spring 2023
 */
public class StringTooLongException extends Exception {

	/**
	 * Default constructor for StringTooLongException.
	 */
	public StringTooLongException() {
		super();
	}//end default constructor

	/**
	 * Constructor for StringTooLongException with a custom error message.
	 */
	public StringTooLongException(String message) {
		super(message);
	}//end preferred constructor

}//end class