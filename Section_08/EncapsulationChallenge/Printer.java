public class Printer {
    private int tonerLevel;
    private int pagesPrinted;

    private boolean duplex;

    public Printer(int startingTonerAmount, boolean isDuplex) {
        tonerLevel = (startingTonerAmount >= 0 && startingTonerAmount <= 100) ? startingTonerAmount : -1;
        pagesPrinted = 0;
        duplex = isDuplex;
    }

  

    public int addToner(int tonerAmount) {
        if (tonerLevel + tonerAmount < 0 || tonerLevel + tonerAmount > 100) {
            return -1;
        }

        tonerLevel += tonerAmount;

        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = 0;

        if (duplex) {
            pagesToPrint = pages / 2;
            pagesToPrint += (pages % 2 == 1) ? 1 : 0;
        } else {
            pagesToPrint = pages;
        }

        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}