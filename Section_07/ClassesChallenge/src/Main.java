class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount();
        newAccount.setBalance(1_0000);
        System.out.println("Starting balance is: " + newAccount.getBalance());
        newAccount.deposit(100);
        System.out.println("Balance after deposit is: " + newAccount.getBalance());
        newAccount.withdrawal(200);
        System.out.println("Balance after withdrawal is: " + newAccount.getBalance());
    }
}