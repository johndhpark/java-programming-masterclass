import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.print("Hi " + name + ", Thanks for taking the course!");
        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            String dateOfBirth = scanner.nextLine();
            age = checkData(currentYear, dateOfBirth);
            validDOB = age >= 0 ? true : false;
        } while (!validDOB);

        scanner.close();
        return "So you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}