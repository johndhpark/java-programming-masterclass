class Main {
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args) {
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(-41));
		System.out.println(getDurationString(65, 9));
	}

	private static String getDurationString(long minutes, long seconds) {
		if (minutes < 0 || seconds < 0 || seconds > 59)
			return INVALID_VALUE_MESSAGE;

		long hours = minutes / 60;
		long remMinutes = minutes % 60;

		String hoursString = hours < 10 ? "0" + hours : hours + "";
		String minsString = remMinutes < 10 ? "0" + remMinutes : remMinutes + "";
		String secString = seconds < 10 ? "0" + seconds : seconds + "";

		return hoursString + "h " + minsString + "m " + secString + "s";
	}

	private static String getDurationString(long seconds) {
		if (seconds < 0)
			return INVALID_VALUE_MESSAGE;

		long minutes = seconds / 60;
		long remSecs = seconds % 60;

		return getDurationString(minutes, remSecs);
	}
}