import org.feb6homework.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalc {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void itAdd(){
        assertEquals(8, calculator.add(3,5));
    }

    @Test
    public void itSubtract(){
        assertEquals(3, calculator.subtract(9, 6));
    }

    @Test
    public void itMultiply(){
        assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    public void itDivide(){
        assertEquals(2.50, calculator.divide(10, 4), 0.0);
    }
}
