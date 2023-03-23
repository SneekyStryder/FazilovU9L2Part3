public class Vehicle {
    private String model;
    private String color;

    public Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void drive() {
        System.out.println("Vroom vroom");
    }
}
