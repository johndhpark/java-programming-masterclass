import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT") + " a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT") + " a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT") + " a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT") + " a prime number");

        int primeNumberCounter = 0;

        Random random = new Random();
        int randomIndx = random.nextInt(1000 - 1 + 1) + 1;

        for (int num = 1; num <= randomIndx; num++) {
            if (isPrime(num)) {
                System.out.println(num);
                primeNumberCounter += 1;
            }
        }

        System.out.println("Prime Count is " + primeNumberCounter);
        // return primeNumberCounter;
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2)
            return wholeNumber == 2;

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0)
                return false;
        }

        return true;
    }
}