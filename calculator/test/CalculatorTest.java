import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        RandomStub random = new RandomStub();
        calculator = new Calculator(random);
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
    public void shouldKnowHowToMultiply() {
        assertEquals(9, calculator.multiply(3, 3));
    }

    @Test
    public void shouldKnowHowToMultiplyAnyNumber() {
        assertEquals(8, calculator.multiply(2, 4));
    }

    @Test
    public void shouldKnowHowToMultiplyWithRandomNumber() throws Exception {
        assertThat(calculator.multiplyByRandom(2), equalTo(24));
    }

    @Test
    public void shouldKnowHowToMultipleZeroWithRandomNumber() throws Exception {
        assertThat(calculator.multiplyByRandom(0), equalTo(0));
    }
}
