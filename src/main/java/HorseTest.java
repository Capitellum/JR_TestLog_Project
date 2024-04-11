import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)

public class HorseTest {

    @BeforeAll
    public static void initialization(){}

    @Test
    public void Horse(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Horse horse = new Horse(null, 0.0);
        });
        assertEquals("Name cannot be null.", exception.getMessage());
        }

    @Test
    public void getName(){}

    @Test
    public void getSpeed(){}

    @Test
    public void getDistance(){}

    @Test
    public void move(){}
}
