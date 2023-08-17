class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 1234 " + sumDigits(4));
        System.out.println("The sum of the digits in number 1234 " + sumDigits(32123));
    }

    private static int sumDigits(int num) {
        if (num < 0)
            return -1;

        int sum = 0;

        while (num > 0) {
            int dig = num % 10;
            sum += dig;

            num /= 10;
        }

        return sum;
    }
}