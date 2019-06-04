import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void multiplyWithZeroShouldBeZero() {
        Calculator tester = new Calculator();
        assertEquals(0, tester.multiply(5,0));
        assertEquals(0, tester.multiply(0,5));
    }

    @Test
    public void addZeroShouldNotChangeResult() {
        Calculator tester = new Calculator();
        assertEquals(10, tester.add(10,0));
        assertEquals(10, tester.add(0,10));
    }
}
