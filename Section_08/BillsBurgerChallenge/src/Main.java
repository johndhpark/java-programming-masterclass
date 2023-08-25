package BillsBurgerChallenge.src;

public class Main {
    public static void main(String[] args) {
        // Item coke = new Item("coke", "drink", 1.50);
        // coke.printItem();
        // coke.setSize(Size.LARGE);
        // coke.printItem();

        // Item avocado = new Item("avocado", "Topping", 1.50);
        // avocado.printItem();

        // MealOrder regularMeal = new MealOrder();
        // regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        // regularMeal.setDrinkSize(Size.LARGE);
        // regularMeal.printItemizedList();

        // MealOrder secondMeal = new MealOrder("turger", "7-up", "chili");
        // secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        // secondMeal.setDrinkSize(Size.SMALL);
        // secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.printItemizedList();
    }
}