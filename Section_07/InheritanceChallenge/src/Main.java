package src;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "1985-11-11", "2020-01-01");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "1990-11-11", "2020-03-30", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "1970-05-05", "2021-03-03", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}