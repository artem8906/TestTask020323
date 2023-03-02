import org.example.Calculator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {


    @Test
    public void nullCheckTest() {
        assertEquals(0, new Calculator(null).getResult());
        assertEquals(0, new Calculator("").getResult());
    }

    @Test
    public void handlerTest() {
        Calculator calc1 = new Calculator("65 g3");
        Calculator calc2 = new Calculator("-4 7");
        assertEquals(0, calc1.getResult());
        assertEquals(0, calc2.getResult());
    }

    @Test
    public void ignoreGreaterThan100Test() {
        assertEquals(2 + 5 + 100, new Calculator("2 100 5 300").getResult());
    }


    @Test
    public void differentDilimeterTest() {
        assertEquals(0 + 5 + 9 + 33, new Calculator("0,5,9,33").getResult());
        assertEquals(0 + 5 + 9 + 33, new Calculator("0.5.9.33").getResult());
        assertEquals(0 + 5 + 9 + 33, new Calculator("0.5/9/33").getResult());
    }

}
