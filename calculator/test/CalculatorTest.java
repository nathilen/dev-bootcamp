import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void shouldKnowHowToAddTwoNumbers() throws Exception {
        int expectedResult = 9;
        int result = calculator.add(3, 6);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldKnowHowToAddNumberWithZero() throws Exception {
        int expectedResult = 5;
        int result = calculator.add(5, 0);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldKnowHowToAddMoreThanTwoNumbers() throws Exception {
        int expectedResult = 15;
        int result = calculator.add(7, 2, 6);
        assertEquals(expectedResult, result);
    }
}
