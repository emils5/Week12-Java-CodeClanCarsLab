import Vehicles.Car;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void before() {
        car = new ElectricCar("Red", 10000);
    }

    @Test
    public void hasColour(){
        assertEquals("Red", car.getColour());

    }
    @Test
    public void hasPrice(){
        assertEquals(10000, this.car.getPrice(), 0);
    }
}