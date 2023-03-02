import org.junit.jupiter.api.Test;

import static org.example.Calculator.handlerAndPrintOut;
import static org.example.Calculator.plus;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {

    @Test
    public void nullCheckTest() {
        assertEquals(0, plus(null));
        assertEquals(0, plus(""));
    }

    @Test
    public void exceptionsTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            plus("0 -6 9 3");
        });
        assertThrows(NumberFormatException.class, () -> {
            plus("5 gf");
        });
    }

    @Test
    public void handlerTest() {
        handlerAndPrintOut("0 -6 9 3");
        handlerAndPrintOut("5 gf");
    }

    @Test
    public void ignoreGreaterThan100Test() {
        assertEquals(2 + 5 + 100, plus("2 100 5 300"));
    }

    @Test
    public void differentDilimeterTest() {
        assertEquals(plus("0 5 9 33"), plus("0,5,9,33"));
        assertEquals(plus("0 5 9 33"), plus("0.5.9.33"));
        assertEquals(plus("0 5 9 33"), plus("0/5/9/33"));
    }

}
