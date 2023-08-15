import java.util.Scanner;


class ReadingUserInputChallenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int count = 0;

		while (count < 10) {
			System.out.println("Enter number #" + (count + 1));

			boolean hasNextInt = scanner.hasNextInt();

			if (hasNextInt) {
				sum += scanner.nextInt();
				++count;
			}
			else { 
				System.out.println("Invalid entry.");
				scanner.nextLine();
			}
		}

		System.out.println("The total is: " + sum);
		scanner.close();
	}
}