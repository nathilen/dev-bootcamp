//Job: Understands a 4-sided polygon with adjacent sides connecting at 90 degrees

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {

        if (length <= 0 || width <= 0) {
            throw new RuntimeException("Length and width must be positive");
        }
        this.length = length;
        this.width = width;
    }

    public int area() {

        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public static Rectangle asSquare(int side) {
        return new Rectangle(side, side);
    }

    @Override
    public boolean equals(Object object) {

        if(this == object)
        {
            return true;
        }

        if(object == null){
            return  false;
        }

        if(!(object instanceof Rectangle)){
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        if (this.length != rectangle.length ||
                this.width != rectangle.width) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Rectangle with width=" + width + ", length=" + length;
    }


}
