public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.iceBox = new Refrigerator();
        this.dishWasher = new DishWasher();
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        super();
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        iceBox.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag, boolean dishWasherFlag, boolean fridgeFlag) {
        this.brewMaster.setHasWorkToDo(coffeeFlag);
        this.dishWasher.setHasWorkToDo(dishWasherFlag);
        this.iceBox.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}

class IoT {
    protected boolean hasWorkToDo;

    public IoT() {
        this.hasWorkToDo = false;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class CoffeeMaker extends IoT {
    public CoffeeMaker() {
        super();
    }

    public void brewCoffee() {
        if (getHasWorkToDo() == true) {
            System.out.println("Brewing coffee");
            setHasWorkToDo(false);
        }
    }
}

class DishWasher extends IoT {
    public DishWasher() {
        super();
    }

    public void doDishes() {
        if (getHasWorkToDo() == true) {
            System.out.println("Washing dishes");
            setHasWorkToDo(false);
        }
    }
}

class Refrigerator extends IoT {
    public Refrigerator() {
        super();
    }

    public void orderFood() {
        if (getHasWorkToDo() == true) {
            System.out.println("Ordering food");
            setHasWorkToDo(false);
        }
    }
}