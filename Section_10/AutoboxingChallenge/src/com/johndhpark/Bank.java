package com.johndhpark;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>(5000);
    }

    public Customer findCustomer(String name) {
        for (Customer currCustomer : customers) {
            if (currCustomer.name().equalsIgnoreCase(name)) {
                return currCustomer;
            }
        }

        System.out.printf("Customer %s wasn't found%n", name);
        return null;
    }

    public boolean addNewCustomer(String customerName, double initialDeposit) {
        if (findCustomer(customerName) != null)
            return false;

        customers.add(new Customer(customerName, initialDeposit));

        System.out.println("New Customer added: " + customerName);
        return true;
    }

    public boolean addTransaction(String customerName, double transactionAmount) {
        Customer customer = findCustomer(customerName);

        if (customer == null)
            return false;

        customer.transactions().add(transactionAmount);

        return false;
    }

    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);

        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name; " + customer.name());
        System.out.println("Transactions:");
        for (double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + "\'" +
                ", customers=" + customers +
                "}";
    }
}