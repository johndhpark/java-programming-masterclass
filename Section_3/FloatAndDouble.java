public class FloatAndDouble {
	public static void main(String[] args) {
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;

		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;

		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;

		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);
		System.out.println("MyDoubleValue = " + myDoubleValue);

		double pound = 16d;
		double conversion = 0.45359237d;

		double kilograms = pound * conversion;

		System.out.println(pound + " lbs equals to " + kilograms + " kilograms");

		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.4_567_890d;

		System.out.println(pi);
		System.out.println(anotherNumber);
	}
}