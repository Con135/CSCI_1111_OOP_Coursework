class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private java.util.Date dateCreated = new java.util.Date();
	
	Account() {
	}

	Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
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
		withdraw();
		deposit();
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	//Annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	//Date created
	public String getDateCreated() {
		return dateCreated.toString();
	}
	//Monthly interest
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	double getMonthlyInterest() {
		return balance * (annualInterestRate / 12);
	}
	double withdraw() {
		balance -= 2500;
		return balance;
	}
	double deposit() {
		balance += 3000;
		return balance;
	}
}