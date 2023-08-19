package src;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDateString) {
        this.name = name;
        this.birthDate = birthDateString;
    }

    public int getAge() {
        LocalDate birthDate = LocalDate.parse(this.birthDate,
                DateTimeFormatter.ISO_DATE);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        int year = age.getYears();

        return year;
    }

    public double collectPay() {
        return 0.00;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + "'" +
                ", birthDate='" + birthDate + "'" +
                ", endDate='" + endDate + "'" +
                "}";
    }
}