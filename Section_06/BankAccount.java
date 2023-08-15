class BankAccount {
	private String number;
	private double balance;
	private String name;
	private String phoneNumber;

	public BankAccount() {
		this("56789", 2.50, "Default name", "Default Phone");
		System.out.println("Empty constructor called.");
	}

	public BankAccount(String number, double balance, String name, String phoneNumber) {
		System.out.println("Constructor with parameter called");
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return number;
	}

	public void setAccountNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		balance = amount;
	}

	public String getCustomerName() {
		return name;
	}

	public void setCustomerName(String name) {
		this.name = name;
	}

	public String getPhonenNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String number) {
		phoneNumber = number;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
	}

	public void withdraw(double amount) {
		if (amount - balance < 0) {
			System.out.println("Only " + balance + " available. Withdrawal not processed");
		}

		balance -= amount;
	}

	public static void main(String[] args) {
		BankAccount johnsAccount = new BankAccount();

		johnsAccount.withdraw(100.0);

		johnsAccount.deposit(50);
		johnsAccount.withdraw(100.00);

		johnsAccount.deposit(51);
		johnsAccount.withdraw(100.00);

	}
}