import java.util.Scanner;


class MinAndMaxInputChallenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while (true) {
			System.out.println("Enter number");

			boolean isValid = scanner.hasNextInt();

			if (!isValid) break;

			int num = scanner.nextInt();

			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		scanner.close();


		System.out.println("The min is " + min + ".");
		System.out.println("The max is " + max + ".");
	}
}