import java.util.Scanner;

public class exercise_6_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		
		System.out.print("Enter a password: ");
		s = input.nextLine();
		
		if (isValid(s) == true) {
			System.out.println("Valid Password.");
		}
		else {
			System.out.println("Invalid Password.");
		}
		input.close();
	}
	public static boolean isValid(String s) {
		boolean result = true;
		int digitCount = 0;
		
		if (s.length() >= 8) {
			
			for(int count = 0; count < s.length(); count++) {
			
				if (s.charAt(count) >= 'A' && s.charAt(count) <= 'Z') {
				}
				else if (s.charAt(count) >= 'a' && s.charAt(count) <= 'z') {
				}
				else if (s.charAt(count) >= '0' && s.charAt(count) <= '9') {
					digitCount++;
				}
				else {
					result = false;
				}
			}
		}
		else {
			result = false;
		}
		if (digitCount >= 2) {
		}
		else {
			result = false;
		}
		return result;	
	}
}
