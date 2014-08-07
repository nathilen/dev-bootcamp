import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class RectangleTest {

    private Rectangle rectangle;

    @Test
    public void shouldCalculateAreaWhenLengthIs5andWidthIs4() throws Exception {
        rectangle = new Rectangle(5, 4);
        assertEquals(20, rectangle.area());
    }

    @Test
    public void shouldCalculateAreaWhenLengthAndWidthAreDifferent() throws Exception {
        rectangle = new Rectangle(7, 4);
        assertEquals(28,rectangle.area());
    }

    @Test (expected = RuntimeException.class)
    public void shouldNotAllowRectangleWithNegativeLength() throws Exception {
        rectangle = new Rectangle(-2, 1);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowRectangleWithNegativeWidth() throws Exception {
        rectangle = new Rectangle(2, -1);
        System.out.println(rectangle.area());
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowRectangleWithLengthOfZero() throws Exception {
        rectangle = new Rectangle(0, 2);
    }

    @Test
    public void shouldNotAllowRectangleWithWidthOfZero() throws Exception {
        try {
            new Rectangle(2,0);
            fail("Should have thrown an exception");

        } catch (RuntimeException exception) {
            assertEquals("Length or width cannot be negative", exception.getMessage());
        }
    }
}
