import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorcycleTest {

    Motorcycle motorcycle;

    @BeforeEach
    void setUp(){
        motorcycle = new Motorcycle("Harley Davidson");
    }

    @Test
    void hasMaxOccupancy(){
        assertThat(motorcycle.maxOccupancy()).isEqualTo(2);
    }

    @Test
    void hasNumberOfWheels(){
        assertThat(motorcycle.numberOfWheels()).isEqualTo(2);
    }

    @Test
    void hasFuelType(){
        assertThat(motorcycle.fuelType()).isEqualTo("Diesel");
    }

    @Test
    void isManual(){
        assertThat(motorcycle.manual()).isEqualTo(true);
    }

    @Test
    void canDoWheelie(){
        assertThat(motorcycle.wheelie()).isEqualTo(true);
    }

    @Test
    public void canRun(){
        String result = motorcycle.wheelie(250);
        assertThat(result).isEqualTo("Harley Davidson's can wheelie up to 250m");
    }
}
