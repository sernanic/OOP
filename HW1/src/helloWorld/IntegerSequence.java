package helloWorld;
import java.util.InputMismatchException;
import java.util.Scanner;  // Import the Scanner class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class IntegerSequence {
	static String FileName;
	public IntegerSequence(String fileName) {
		FileName = fileName;
	}
	public static void createFile(String FileName) {
		 try {
		      File myObj = new File(FileName);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	public static void writeToFile(int fileIntContent) {
		try {
		      FileWriter Writer = new FileWriter(FileName);
		      Writer.write(fileIntContent+"");
		      Writer.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	public static int getIntegerSequence() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number sequence");
		boolean keepInput = true;
		int numberForSequence = 0;
		while(keepInput == true) {
			try {
				numberForSequence = scan.nextInt();
				writeToFile(numberForSequence);
				}
			catch(InputMismatchException err){
				System.out.println("Input is not an integer sequence input question terminated");
				keepInput = false;
			}
			
		}
	    return -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of file including extension");
		String fileName = scan.nextLine();
		IntegerSequence firstInstance = new IntegerSequence(fileName);
		createFile(fileName);
		getIntegerSequence();
	}
}
