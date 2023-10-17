import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    void setUp(){
        vehicle = new Car("BMW",5);
    }




}
