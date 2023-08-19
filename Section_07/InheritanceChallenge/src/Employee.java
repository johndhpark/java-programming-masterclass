package src;

public class Employee extends Worker {
    private static int employeeNo = 1;

    private long employeeId;
    private String hireDate;

    public Employee() {

    }

    public Employee(String name, String birthDateString, String hireDate) {
        super(name, birthDateString);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeId=" + employeeId +
                ", hireDate=" + hireDate +
                "} " + super.toString();
    }
}