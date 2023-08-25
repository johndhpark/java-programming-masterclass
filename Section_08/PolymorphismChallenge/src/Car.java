public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car starting engine. Vroooom Vrooom!");
    }

    protected void runEgine() {
        System.out.println("Car -> runEgine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEgine();
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cyclinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinders = cyclinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, REady!%n", cyclinders);
    }

    @Override
    protected void runEgine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, REady!%n", batterySize);
    }

    @Override
    protected void runEgine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cyclinders = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinders = cyclinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybr -> All %d cylinders are fired up, REady!%n", cyclinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", this.batterySize);
    }

    @Override
    protected void runEgine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}
