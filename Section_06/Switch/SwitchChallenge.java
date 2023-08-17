class SwitchChallenge {
    public static void main(String[] args) {
        char charValue = 'A';

        SwitchChallenge.getWord(charValue);
    }

    public static void getWord(char c) {
        switch (c) {
            case 'A':
                System.out.println(c + " Able");
                break;
            case 'B':
                System.out.println(c + " Baker");
                break;
            case 'C':
                System.out.println(c + " Charlie");
                break;
            case 'D':
                System.out.println(c + " Dog");
                break;
            case 'E':
                System.out.println(c + " Easy");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }
    }
}