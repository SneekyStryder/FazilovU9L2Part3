public class Truck extends Vehicle {
    private int wheels;

    public Truck(String model, String color, int wheels) {
        super(model, color);
        this.wheels = wheels;
    }

    public void carryCargo() {
        System.out.println("Carrying cargo...");
    }
}
