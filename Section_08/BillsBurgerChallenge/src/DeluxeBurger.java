package BillsBurgerChallenge.src;

public class DeluxeBurger extends Burger {
    private Item deluxe1;
    private Item deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new Item(extra4, "TOPPING", 0.00);
        deluxe2 = new Item(extra5, "TOPPING", 0.00);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        Item.printItem(deluxe1.getName(), 0);
        Item.printItem(deluxe2.getName(), 0);
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }

}