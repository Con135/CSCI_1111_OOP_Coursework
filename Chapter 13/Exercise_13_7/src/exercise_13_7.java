import java.util.Scanner;

public class exercise_13_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double side1 = 0;
		double side2 = 0;
		double side3 = 0;
	
		Triangle[] triangleArray = new Triangle[5];
				
		for (int i = 0; i < triangleArray.length; i++) {
			side1 = i * i + 5;
			side2 = i * i + 6;
			side3 = i * i + 7;
			triangleArray[i] = new Triangle(side1, side2, side3);
		}
		
		for (int i = 0; i < triangleArray.length; i++) {
			System.out.println("\nArea of triangle: " + triangleArray[i].getArea() 
								+ "\n" + triangleArray[i].howToColor());
		}
	}
}