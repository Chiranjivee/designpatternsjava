public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMakerFacade facade = new ShapeMakerFacade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }
}