package Vehicles;

public abstract class Car {
    private String colour;
    private double price;

    public Car(String colour, double price) {
        this.colour = colour;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }
}
