class Sum3and5Challenge {
    public static void main(String[] args) {
        int totSum = 0;

        for (int num = 1, count = 0; count < 5; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                ++count;
                totSum += num;
            }
        }

        System.out.println("The total sum is: " + totSum);
    }
}