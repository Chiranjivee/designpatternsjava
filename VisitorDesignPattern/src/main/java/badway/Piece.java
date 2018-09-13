package badway;

public class Piece extends ChessComponent {

    private String color;

    public Piece(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void visit() {
        System.out.println("Visiting: " + this.getComponentName() +
                ", color: " + this.getColor());
    }
}
