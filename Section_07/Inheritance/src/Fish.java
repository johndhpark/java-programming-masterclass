public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, String size, double weight, int fins, int gills) {
        super(type, size, weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.println("muscles moving");
    }

    private void moveBackFins() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        // TODO Auto-generated method stub
        super.move(speed);
        moveMuscles();

        if (speed == "fast") {
            moveBackFins();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish { " +
                "gills='" + gills +
                ", fins='" + fins +
                "} " + super.toString();
    }
}
