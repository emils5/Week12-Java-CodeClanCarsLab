package Vehicles;

public abstract class Car {
    private int colour;
    private double price;

    public Car(int colour, double price) {
        this.colour = colour;
        this.price = price;
    }

    public int getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }
}
