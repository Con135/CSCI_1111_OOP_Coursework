import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class exercise_12_15 {
	public static void main(String[] args) throws Exception {
		
		int[] intList = new int[100];
		int[] printList = new int[100];
		int printIndex = 0;
		
		File file = new File("Exercise12_15.txt");
		PrintWriter output = new PrintWriter(file);
		Scanner input = new Scanner(file);
		
		//Checks if file exists/creates it
		if(file.exists()) {
		}
		else {
			new File("Exercise12_15.txt");
		}
		
		//Creates array/sends array
		for(int arrayCount = 0; arrayCount <= 99; arrayCount++) {
			intList[arrayCount] = (int)(Math.random() * 10);
			output.print(intList[arrayCount] + " ");
		}
		output.close();
		
		//Receives array
		while (input.hasNext()) {
			printList[printIndex] = input.nextInt();
			printIndex++;
		}
		Arrays.sort(printList);
		
		//Prints array
		for(int printCount = 0; printCount <= 99; printCount++) {
			System.out.print(printList[printCount] + " ");
		}
		input.close();
	}
}