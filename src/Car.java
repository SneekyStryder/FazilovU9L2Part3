public class Car extends Vehicle {
    private int passengers;

    public Car(String model, String color, int passengers) {
        super(model, color);
        this.passengers = passengers;
    }

    public void drivePeople() {
        System.out.println("Driving people...");
    }
}
