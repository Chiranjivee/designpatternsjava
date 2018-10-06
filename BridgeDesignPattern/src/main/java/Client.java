

public class Client {
    public static void main(String[] args) {
        RedColor redColor = new RedColor();
        GreenColor greenColor = new GreenColor();

        Shape square = new Square(4, redColor);
        square.paintShape();

        square.setColor(greenColor);
        square.paintShape();

        Rectangle rectangle = new Rectangle(6, 3, greenColor);
        rectangle.paintShape();
    }

    public static void badEg() {
        Shape square = new Square(4, new RedColor());
        square.paintShape();

        square.setColor(new GreenColor());
        square.paintShape();

        Rectangle rectangle = new Rectangle(4, 8, new GreenColor());
        rectangle.paintShape();
    }
}