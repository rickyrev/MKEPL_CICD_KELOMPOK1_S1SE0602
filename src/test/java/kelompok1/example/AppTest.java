package kelompok1.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGreetWithNormalName() {
        assertEquals("Halo, Andi!", App.greet("Andi"));
    }

    @Test
    public void testGreetWithEmptyString() {
        assertEquals("Halo, !", App.greet(""));
    }

    @Test
    public void testGreetWithSpecialCharacters() {
        assertEquals("Halo, @123!", App.greet("@123"));
    }
}
