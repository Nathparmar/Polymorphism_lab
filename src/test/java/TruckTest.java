import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TruckTest {

    Truck truck;


    @BeforeEach
    void setUp(){
        truck = new Truck("Monster");
    }

    @Test
    void hasMaxOccupancy(){
        assertThat(truck.maxOccupancy()).isEqualTo(5);
    }

    @Test
    void hasNumberOfWheels(){
        assertThat(truck.numberOfWheels()).isEqualTo(4);
    }

    @Test
    void hasFuelType(){
        assertThat(truck.fuelType()).isEqualTo("Diesel");
    }

    @Test
    void isManual(){
        assertThat(truck.manual()).isEqualTo(true);
    }

    @Test
    void canAddLoad(){
        truck.addLoad(100);
        double actual = truck.getLoad();
        assertThat(actual).isEqualTo(100);

    }

}
