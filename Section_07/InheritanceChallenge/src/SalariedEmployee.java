package src;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDateString,
            String hireDate, double annualSalary) {
        super(name, birthDateString, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustedPay;
    }

    public void retire() {
        terminate("2025-12-12");
        this.isRetired = true;
    }

}
