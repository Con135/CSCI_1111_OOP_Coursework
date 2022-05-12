import java.util.Scanner;

public class exercise_12_3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	
	int[] intList = new int[100];
	
	for(int count = 0; count <= 99; count++) {
		intList[count] = (int)(Math.random() * 10);
	}
	
	System.out.print("Enter an index(1-100): ");
	int inputedIndex = input.nextInt();
	int listIndex = inputedIndex - 1;
	
	try {
		int listInteger = intList[listIndex];
		System.out.println("The integer at index " + inputedIndex + " is " + listInteger + ".");
	}
	catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Out of Bounds.");
	}
	}
}