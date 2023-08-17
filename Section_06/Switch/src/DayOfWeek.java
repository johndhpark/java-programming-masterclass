class DayOfWeek {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            DayOfWeek.printDayOfWeek(i);
        }

    }

    static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfTheWeek);
    }
}