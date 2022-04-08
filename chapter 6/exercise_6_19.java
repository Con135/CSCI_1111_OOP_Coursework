import java.util.Scanner;

public class exercise_6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1 = 0.0;
		double side2 = 0.0;
		double side3 = 0.0;
		boolean valid = false;
		
		System.out.println("Please enter three sides of a triangle: ");
		side1 = input.nextDouble();
		
		side2 = input.nextDouble();
		
		side3 = input.nextDouble();
		
		valid = isValid(side1, side2, side3);
	
		if (valid == true) {
			area(side1, side2, side3);
			System.out.printf("Side 1: " + side1 + "\n" + "Side 2: " + side2 + "\n" + "Side 3: " + side3 + "\n" + "Area:  %4.1f", area(side1, side2, side3));
		}
		else {
			System.out.print("This is not a valid triangle.");
		}
		
		input.close();
	}	
	/** Return true if the sum of every two sides is greater than the third side.*/
	public static boolean isValid(double side1, double side2, double side3) {
		boolean valid;
		if(side1 + side2 > side3) {
			if(side1 + side3 > side2) {
				if(side2 + side3 > side1) {
					valid = true;
				}
				else {
					valid = false;
				}
			}
			else {
				valid = false;
			}
		}
		else {
			valid = false;
		}
		return valid;
	}
	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {
		double result = 0.0;
		double s = 0.0;
		
		s = ((side1 + side2 + side3) / 2);
		
		result = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return result;
	}
}