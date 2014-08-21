import junit.framework.Assert;
import org.junit.Test;

import java.io.File;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class RectangleTest {

    private Rectangle rectangle;

    @Test
    public void shouldCalculateArea() throws Exception {
        rectangle = new Rectangle(5, 4);
        assertEquals(20, rectangle.area());
    }

    @Test
    public void shouldCalculateAreaGivenAnyLengthAndWidth() throws Exception {
        rectangle = new Rectangle(7, 4);
        assertEquals(28, rectangle.area());
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowRectangleWithNegativeLength() throws Exception {
        rectangle = new Rectangle(-2, 1);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowRectangleWithNegativeWidth() throws Exception {
        rectangle = new Rectangle(2, -1);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAllowRectangleWithLengthOfZero() throws Exception {
        rectangle = new Rectangle(0, 2);
    }

    @Test
    public void shouldNotAllowRectangleWithWidthOfZero() throws Exception {
        try {
            new Rectangle(2, 0);
            fail("Should have thrown an exception");

        } catch (RuntimeException exception) {
            assertEquals("Length and width must be positive", exception.getMessage());
        }
    }

    @Test
    public void shouldCalculatePerimeter() throws Exception {
        rectangle = new Rectangle(3, 4);
        assertEquals(14, rectangle.perimeter());
    }

    @Test
    public void shouldCalculatePerimeterGivenAnyLengthAndWidth() throws Exception {
        rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter());
    }

    @Test
    public void shouldKnowThatASquareIsARectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2, 2);
        Rectangle square = Rectangle.asSquare(2);
        assertThat(square, is(rectangle));
    }

    @Test
    public void shouldKnowThatARectangleShouldNotBeNull() throws Exception {
        Rectangle rectangle = new Rectangle(2, 2);
        assertEquals(false,rectangle.equals(null));
    }

    @Test
    public void shouldNotBeEqualToAnObjectOfADifferentType() throws Exception {
        Rectangle rectangle = new Rectangle(3, 3);
        Object obj = new Object();
        assertEquals(false, rectangle.equals(obj));
    }

    @Test
    public void shouldKnowThatTwoRectanglesWithDifferentSidesAreNotTheSame() throws Exception {
        Rectangle rectangle = new Rectangle(4, 4);
        Rectangle anotherRectangle = new Rectangle(7, 3);
        assertEquals(false, rectangle.equals(anotherRectangle));
    }

    @Test
    public void shouldCheckIfARectangleHasTheSameIdentityOrNot() throws Exception {
        Rectangle rectangle = new Rectangle(3, 3);
        Rectangle anotherRectangle = rectangle;
        assertEquals(true, rectangle.equals(anotherRectangle));
    }

}
