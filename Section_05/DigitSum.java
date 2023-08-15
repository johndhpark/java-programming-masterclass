class DigitSum {
	public static int sumDigits(int num) {
		if (num < 10) return -1;

		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		DigitSum d = new DigitSum();

		int sum = d.sumDigits(125);

		System.out.println(sum);
	}
}