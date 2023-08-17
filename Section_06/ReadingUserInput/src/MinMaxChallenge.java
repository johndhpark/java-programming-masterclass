import java.util.Scanner;

class MinMaxChallenge {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int max_num = Integer.MIN_VALUE;
            int min_num = Integer.MAX_VALUE;

            while (true) {
                System.out.println("Enter a number or any character to quit:");
                String user_input = scanner.nextLine();

                try {
                    int entered_num = Integer.parseInt(user_input);

                    max_num = Math.max(max_num, entered_num);
                    min_num = Math.min(min_num, entered_num);

                    System.out.println("The current max and min numbers are: " + max_num + " and " + min_num);
                } catch (NumberFormatException e) {
                    break;
                }
            }
        }
    }
}