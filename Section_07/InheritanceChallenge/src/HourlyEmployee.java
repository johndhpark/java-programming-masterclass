package src;

class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDateString, String hireDate,
            double hourlyPayRate) {

        super(name, birthDateString, hireDate);
        this.hourlyPayRate = hourlyPayRate;

    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
