package kelompok1.example;

import org.junit.Test;
import java.time.LocalTime;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGreetContainsName() {
        String result = App.greet("Andi", LocalTime.of(10, 0, 0));
        assertTrue(result.contains("Andi"));
        assertTrue(result.contains("Halo"));
    }

    @Test
    public void testGreetContainsTime() {
        String result = App.greet("Budi", LocalTime.of(15, 30, 45));
        assertTrue(result.contains("15:30:45")); // waktu pasti
    }
}
