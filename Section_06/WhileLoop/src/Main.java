class Main {
    public static void main(String[] args) {
        int index = 5;
        int evens = 0;
        int odds = 0;

        while (evens < 5) {
            if (isEvenNumber(index)) {
                System.out.println(index + " is a even number");
                ++evens;
            } else {
                ++odds;
            }
            index++;
        }

        System.out.println("There were " + evens + " even numbers and " + odds + " odd numbers.");
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}