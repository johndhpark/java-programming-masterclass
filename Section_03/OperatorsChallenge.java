public class OperatorsChallenge {
	public static void main(String[] args) {
		double myFirstValue = 20.00d;
		double mySecondValue = 80.00d;
		double sum = (myFirstValue + mySecondValue) * 100.00d;
		double rem = sum % 40.00d;

		boolean remIsZero = (rem == 0) ? true : false;
		System.out.println("remIsZero = " + remIsZero);

		if (!remIsZero) {
			System.out.println("Got some remainder");
		}
	}
}