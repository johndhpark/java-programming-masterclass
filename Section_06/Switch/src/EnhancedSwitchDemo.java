class EnhancedSwitchDemo {
    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> System.out.println("Value was actually " + switchValue);
            default -> System.out.println("Was not 1, 2, 3, 4, , or 5");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            default -> {
                String badResponse = month = "is bad";
                yield badResponse;
            }
        };
    }
}