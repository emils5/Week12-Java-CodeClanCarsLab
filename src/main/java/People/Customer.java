package People;

import Behaviours.IBuy;
import Vehicles.Car;

import java.util.ArrayList;

public class Customer implements IBuy {

    private String name;
    private double money;
    private ArrayList<Car> ownedVehicles;

    public Customer(String name, double money, ArrayList ownedVehicles) {
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void buyCar(Car car) {
        if (money > car.getPrice()) {
            this.ownedVehicles.add(car);
        }
    }
}
