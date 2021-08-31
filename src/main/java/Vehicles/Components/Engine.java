package Vehicles.Components;


public class Engine {
    private int number;
    private String model;

    public Engine(int number, String model){
        this.number = number;
        this.model = model;

    }


    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }
}
