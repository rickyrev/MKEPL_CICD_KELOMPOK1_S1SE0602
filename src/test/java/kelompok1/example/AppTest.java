package kelompok1.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGreetContainsName() {
        String result = App.greet("Andi");
        assertTrue(result.contains("Andi"));
        assertTrue(result.contains("Halo"));
    }

    @Test
    public void testGreetContainsTime() {
        String result = App.greet("Budi");
        assertTrue(result.contains(":")); // Harus mengandung jam
    }
}
