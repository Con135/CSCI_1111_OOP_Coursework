import java.util.Scanner;

public class exercise_13_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 1st side of the triangle: ");
		double side1 = input.nextDouble();
		
		System.out.print("Enter the 2nd side of the triangle: ");
		double side2 = input.nextDouble();
		
		System.out.print("Enter the 3rd side of the triangle: ");
		double side3 = input.nextDouble();
	
		System.out.print("Enter the color of the triangle: ");
		GeometricObject.color = input.next();
		
		System.out.print("Enter true or false if the triangle is filled: ");
		GeometricObject.filled = input.nextBoolean();
		
		Triangle triangle1 = new Triangle(side1 ,side2 , side3);
		
		System.out.println("\nArea of triangle: " + triangle1.getArea() 
							+ "\nPerimeter of triangle: " + triangle1.getPerimeter()
							+ triangle1.toString());
	}
}