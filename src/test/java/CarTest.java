import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp(){
        car = new Car("BMW", 4);
    }

    @Test
    void hasMaxOccupancy(){
        assertThat(car.maxOccupancy()).isEqualTo(5);
    }

    @Test
    void hasNumberOfWheels(){
        assertThat(car.numberOfWheels()).isEqualTo(4);
    }

    @Test
    void hasFuelType(){
        assertThat(car.fuelType()).isEqualTo("Diesel");
    }

    @Test
    void isManual(){
        assertThat(car.manual()).isEqualTo(true);
    }

    @Test
    void numberOfDoors_withArgument(){
        assertThat(car.getNumberOfDoors()).isEqualTo(4);
    }





}
