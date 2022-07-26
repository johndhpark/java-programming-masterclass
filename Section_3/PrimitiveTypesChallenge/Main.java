public class Main {
  public static void main(String[] args) {
    byte johnByteNum = 122;
    short johnShortNum = 32_000;
    int johnIntNum = 2_000_000_000;
    long johnLongSum = 50000L + 10L * (johnByteNum + johnIntNum + johnShortNum);

    System.out.println("Long Sum: " + johnLongSum);

  }
}