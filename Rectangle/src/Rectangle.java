public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {

        if(length <= 0 || width <= 0){
           throw  new RuntimeException("Length or width cannot be negative");
        }
        this.length = length;
        this.width = width;
    }

    public int area() {

        return length * width;
    }
}
