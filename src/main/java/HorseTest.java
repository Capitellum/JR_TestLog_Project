import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HorseTest {

    @Test
    public void NullConstructor(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Horse horse = new Horse(null, 0.0);
        });
        assertEquals("Name cannot be null.", exception.getMessage());
        }

    @ParameterizedTest
    @MethodSource("BlankConstructorArgs")
    public void BlankConstructor(String name, double speed){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Horse horse = new Horse(name, speed);
        });
        assertEquals("Name cannot be blank.", exception.getMessage());
    }

    public static Stream<Arguments> BlankConstructorArgs() {
        return Stream.of(
                Arguments.of("", 0.0),
                Arguments.of("  ",0.0),
                Arguments.of("\t", 0.0));
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
