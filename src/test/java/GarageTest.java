import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;

    @BeforeEach
    void setUp(){
        garage = new Garage();
    }

    @Test
    void canCountVehicles(){
        assertThat(garage.countVehicles()).isEqualTo(0);
    }

    @Test
    void canAddVehicles(){
        Vehicle vehicle = new Car("BMW", 5);
        garage.addVehicle(vehicle);
        assertThat(garage.countVehicles()).isEqualTo(1);
    }

    @Test
    void canAddMultipleVehicles(){
        Car car = new Car("BMW", 5);
        Truck truck = new Truck("Monster");
        Motorcycle motorcycle = new Motorcycle("Harley Davidson");
        garage.addVehicle(car);
        garage.addVehicle(truck);
        garage.addVehicle(motorcycle);

        assertThat(garage.countVehicles()).isEqualTo(3);
    }
}
