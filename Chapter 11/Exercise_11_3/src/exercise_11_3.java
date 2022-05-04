import java.text.NumberFormat;

public class exercise_11_3 {
	public static void main(String[] args) {
		//Create new account
		Account newAccount = new Account(1122, 20000.0, 0.045);
		SavingsAccount newSavingsAccount = new SavingsAccount();
		CheckingAccount newCheckingAccount = new CheckingAccount();
		System.out.printf("Account balance: $%4.2f\nMonthly interest: $%4.2f", newAccount.getBalance(), newAccount.getMonthlyInterest());
		System.out.println("\nDate this account was created: " + newAccount.getDateCreated());
		System.out.println(newSavingsAccount.toString());
		System.out.println(newCheckingAccount.toString());
	}
}
//SavingsAccount
class SavingsAccount extends Account{
	private double balance = 500.00;
	SavingsAccount() {
	}
	
	SavingsAccount(double newBalance) {
		balance = newBalance;
		System.out.println(newBalance);
	}
//Balance
	public double getBalance() {
		withdraw();
		deposit();
	return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
//String
	public String toString() {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		return "SavingsAccount balance: " + format.format(getBalance());
	}
}
//CheckingAccount
class CheckingAccount extends Account{
	private double balance = 300.00;
	CheckingAccount() {
	}
	
	CheckingAccount(double newBalance) {
		balance = newBalance;
		System.out.println(newBalance);
	}
//Balance
	public double getBalance() {
		withdraw();
		deposit();
	return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
//String
	public String toString() {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		return "CheckingAccount balance: " + format.format(getBalance()) +  "\nCheckingAccount overdraft limit: $500.00";
	}
}