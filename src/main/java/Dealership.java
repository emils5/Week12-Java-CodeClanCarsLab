import Behaviours.IBuy;
import Behaviours.ISell;
import Vehicles.Car;

import java.util.ArrayList;

public class Dealership implements IBuy, ISell {
    private ArrayList<Car> cars;
    private double till;

    public Dealership(ArrayList<Car> cars, double till) {
        this.cars = new ArrayList<Car>();
        this.till = till;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public double getTill() {
        return till;
    }

    public int getNumberOfCars(){
        return this.cars.size();
    }

    public void buyCar(Car car){
        if (till > car.getPrice()) {
            this.cars.add(car);
        }
    }

    public void sellCar(Car car){
        this.cars.remove(car);
    }




    @Override
    public double getPrice(Car car) {
        return 10000;
    }
}
