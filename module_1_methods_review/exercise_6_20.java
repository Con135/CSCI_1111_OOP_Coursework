import java.util.Scanner;

public class exercise_6_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		int sLength;
		
		System.out.print("Enter a string: ");
		s = input.nextLine();
		
		sLength = s.length();
		
		System.out.println("'" + s + "' is " + sLength + " characters long.");
		
		System.out.println("There are " + countLetters(s) + " letters in '" + s + "'.");
		
		input.close();
	}
	public static int countLetters(String s) {
		int result = 0;
		
		for(int count = 0; count < s.length(); count++) {
			
			if (s.charAt(count) >= 'A' && s.charAt(count) <= 'Z') {
				result++;
			}
			else if (s.charAt(count) >= 'a' && s.charAt(count) <= 'z') {
				result++;
			}
			else {
			}
		}
		return result;	
	}
}