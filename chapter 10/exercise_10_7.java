import java.util.Scanner;

public class exercise_10_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		boolean validId = false;
		int newId;
		int id = 0;
		int choice = 0;
		//Create accounts
		Account[] accounts = new Account[10];
		
		for(int count1 = 0; count1 < accounts.length; count1++) {
			accounts[count1] = new Account(count1, 100.00);
		}
		do {
		//Prompt for an id
			while (validId == false) {
				System.out.print("Enter an id(0-9): ");
				int checkId = input.nextInt();
				if (checkId < 0 || checkId > 9) {
					System.out.println("Please enter a valid id.");	
				}
				else {
					newId = checkId;
					accounts[newId].setId(newId);
					validId = true;
				}
			}
			//Main menu
			while (choice != 4) {
				choice = 0;
				System.out.print("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
				int checkChoice = input.nextInt();
				boolean validChoice = false;
				while (validChoice == false) {
					if (checkChoice == 1) {
						choice = 1;
						validChoice = true;
					}
					else if (checkChoice == 2) {
						choice = 2;
						validChoice = true;
					}
					else if (checkChoice == 3) {
						choice = 3;
						validChoice = true;
					}
					else if (checkChoice == 4) {
						choice = 4;
						validChoice = true;
					}
					else {
						System.out.print("Enter a choice: ");
						checkChoice = input.nextInt();
					}
				}
				if (choice == 1) {
					System.out.println("The balance is: " + accounts[id].getBalance());
				}
				if (choice == 2) {
					accounts[id].withdraw();
				}
				if (choice == 3) {
					accounts[id].deposit();
				}
				else {
				}
			}
		validId = false;
		newId = 0;
		id = 0;
		choice = 0;
		} while (x == 0);
	}
}
class Account {
	Scanner input = new Scanner(System.in);
	private int id = 0;
	private double balance = 0.0;

	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	//Id
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	//Balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	double withdraw() {
		boolean validWithdraw = false;
		String checkWithdraw = "0";
		while (validWithdraw == false) {
			System.out.print("Enter an amount to withdraw: ");
			checkWithdraw = input.next();
			for (int countW = 0; countW < checkWithdraw.length(); countW++) {
				if (Character.isDigit(checkWithdraw.charAt(countW)) == true || checkWithdraw.charAt(countW) == '.') {
					validWithdraw = true;
				}
				else {
					System.out.println("Please enter a withdrawal amount.");
					withdraw();
				}
			}
		}
		Double withdraw = Double.parseDouble(checkWithdraw);
		balance -= withdraw;
		return balance;
	}
	double deposit() {
		boolean validDeposit = false;
		String checkDeposit = "0";
		while (validDeposit == false) {
			System.out.print("Enter an amount to deposit: ");
			checkDeposit = input.next();
			for (int countD = 0; countD < checkDeposit.length(); countD++) {
				if (Character.isDigit(checkDeposit.charAt(countD)) == true || checkDeposit.charAt(countD) == '.') {
					validDeposit = true;
				}
				else {
					System.out.println("Please enter a deposit amount.");
					deposit();
				}
			}
		}
		Double deposit = Double.parseDouble(checkDeposit);
		balance += deposit;
		return balance;
	}
}