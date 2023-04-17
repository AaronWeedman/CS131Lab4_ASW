import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 * The FileProcessor class reads a file, processes its contents, and throws custom exceptions.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Exception Handling Project
 * Spring 2023
 */
public class FileProcessor {

	private String fileName;//will be used to represent the file name
	private int stringLength;//will be used to represent the length of the String
	private ArrayList<String> stringList;
	private Scanner input;
	
	/**
	 * Constructor for FileProcessor.
	 *
	 * @param fileName the name of the file to be processed
	 * @param stringLength the maximum allowed length of strings in the file
	 */
	public FileProcessor(String fileName, int stringLength) {
		setFileName(fileName);
		setStringLength(stringLength);
	}//end constructor
	
	/**
	 * Getter for the size of the stringList ArrayList.
	 *
	 * @return the size of stringList
	 */
	public int getArrayListSize() {
		return stringList.size();
	}//end getArrayListSize
	
	/**
	 * Getter for the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}//end getFileName
	
	/**
	 * Setter for the file name.
	 *
	 * @param fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}//end setFileName
	
	/**
	 * Getter the maximum allowed length of strings.
	 *
	 * @return stringLength
	 */
	public int getStringLength() {
		return stringLength;
	}//end getStringLength
	
	/**
	 * Setter the maximum allowed length of strings.
	 *
	 * @param stringLength
	 */
	public void setStringLength(int stringLength) {
		if(stringLength < 5) {
			this.stringLength = 5;
		}//end if
		else {
			this.stringLength = stringLength;
		}//end else
	}//end setStringLength
	
	/**
	 * Processes the file, reads its contents, and throws custom exceptions for strings that are too long.
	 */
	public void processFile() throws StringTooLongException, FileNotFoundException {
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if(line.length() > stringLength) {
					throw new StringTooLongException("String is too long!");
				}//end if
			}//end while
			scanner.close();
		}//end try
		catch(FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}//end catch
		catch(StringTooLongException e) {
			System.out.println("String too long: " + e.getMessage());
		}//end catch
	}//end processFile
}//end class
