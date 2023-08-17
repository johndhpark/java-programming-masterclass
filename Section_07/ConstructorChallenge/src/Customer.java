public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    Customer() {
        this("Unknown", 0.00, "noemailaddress@emai..com");
    }

    Customer(final String name, final String email) {
        this(name, 0.00, email);
    }

    Customer(final String name, final double creditLimit, final String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void printInfo() {
        System.out.println("Name: " + getName() +
                ", Email Address: " + getEmailAddress() +
                ", Account Limit: " + getCreditLimit());

    }

}