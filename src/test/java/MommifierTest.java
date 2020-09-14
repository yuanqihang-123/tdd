import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void strIsNull() {
        Mommy mommy = new Mommy();
        assertThrows(Exception.class,
                () -> mommy.insertMommy(null));
    }


    @Test
    void strIsEmpty() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("", mommy.insertMommy(""));
    }

    @Test
    void vowelPercentageLessThan30() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("world", mommy.insertMommy("world"));
    }

    @Test
    void vowelsPercentageMoreThan30butNotContinuous() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("world", mommy.insertMommy("world"));
    }

    @Test
    void vowelsPercentageMoreThan30andContinuous() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("kemommyemommyemommyep", mommy.insertMommy("keeeep"));
    }



}
