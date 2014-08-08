import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldKnowHowToAddTwoNumbers() {
        int expectedResult = 9;
        int result = calculator.add(3, 6);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldKnowHowToAddNumberWithZero() {
        int expectedResult = 5;
        int result = calculator.add(5, 0);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldKnowHowToAddMoreThanTwoNumbers() {
        int expectedResult = 15;
        int result = calculator.add(7, 2, 6);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldKnowHowToMultiplyTheCostByNumberOfItems() {
        assertEquals(9, calculator.totalCostForItems(3, 3));
    }

    @Test
    public void shouldKnowHowToMultiplyAnyCostByAnyNumberOfItems() {
        assertEquals(8, calculator.totalCostForItems(2, 4));
    }
}
