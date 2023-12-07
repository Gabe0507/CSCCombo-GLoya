import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Prac {

	public static void main(String[] args) {

		//////// Array of array////////
//		int [][] array1 = new int[3][3];
//		int [] array2 = {0,1,2};
//		int [][] array3 = {{0,1,2}, {3,4,5}, {6,7,8}}; 
//		
//		System.err.println();
		
		// Specify the path to the file
		String filePath = "example.txt";

	try {
		// Create a PrintWriter with FileWriter for writing to the file
		PrintWriter writer = new PrintWriter(new FileWriter(filePath));

		// Write some text to the file
		writer.println("Hello, PrintWriter!");
		writer.println("This is an example of writing to a file in Java.");

		// Close the PrintWriter to ensure that the data is flushed and the file is
		// properly closed
		writer.close();

		System.out.println("Data has been written to the file successfully.");
	} catch (IOException e) {
		// Handle potential IO exceptions
		System.err.println("Error writing to the file: " + e.getMessage());
		}

	}
}
