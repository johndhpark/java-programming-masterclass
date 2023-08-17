import java.util.Scanner;

class ReadingUserInputChallenge {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int valid_num_count = 1;

            while (valid_num_count <= 5) {
                System.out.println("Enter number #" + valid_num_count + ": ");
                try {
                    String input_num = scanner.nextLine();

                    if (Integer.parseInt(input_num) == valid_num_count) {
                        ++valid_num_count;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("That was an invalid entry.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}