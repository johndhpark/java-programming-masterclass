class BankAccount {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;


    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }


    void deposit(final double amount) {
        this.balance += amount;
    }

    void withdrawal(final double amount) {
        if (this.getBalance() > amount) return;
        this.balance -= amount;
    }

}