
public class SimpleForLoop {
    public static void main(String[] args) {
        for (int counter = 0; counter <= 5; counter++) {
            double interestAmount = calculateIntereest(10_000, counter);
            System.out.println("10,0000 at " + counter + "% interest = " + interestAmount);
        }

        for (double index = 7.5; index <= 10; index += 0.25) {
            double interestAmount = calculateIntereest(100, index);

            if (interestAmount > 8.5) {
                break;
            }

            System.out.println("1000 at " + index + "% interest = " + interestAmount);
        }
    }

    public static double calculateIntereest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}