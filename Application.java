import java.io.FileNotFoundException;
/*
 * The Application class demonstrates the usage of the FileProcessor class to process 
 * files and handle exceptions for FileNotFoundException and StringTooLongException.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Exception Handling Project
 * Spring 2023
 */

public class Application {
	
	public static void main(String[] args) {
		
		try {
			FileProcessor bad = new FileProcessor("BadString.txt", 10);//creates a new instance of FileProcessor with filename BadString.txt
			bad.processFile();//calls the processFile method on object bad
		}//end try
		
		catch(FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			}//end catch
		
		catch(StringTooLongException e) {
			System.out.println("Error: " + e.getMessage());
		}//end catch
		
		try {
			FileProcessor good = new FileProcessor("GoodString.txt", 10);//creates a new instance of FileProcessor with filename GoodString.txt
			good.processFile();//calls the processFile method on object good
		}//end try
		
		catch(FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			}//end catch
		
		catch(StringTooLongException e) {
			System.out.println("Error: " + e.getMessage());
		}//end catch
			
	}//end main

}//end class  	