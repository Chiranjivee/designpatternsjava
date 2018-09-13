package badway;

public class BoardBlock extends ChessComponent {

    private String blockColor;
    private Piece piece;

    public BoardBlock(
            String name,
            String blockColor,
            Piece piece)
    {
        super(name);
        this.blockColor = blockColor;
        this.piece = piece;
    }

    public String getBlockColor() {
        return this.blockColor;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void visit() {
        System.out.println("Visiting: " + this.getComponentName() +
                ". This board has " + this.getBlockColor() +
                " and a piece with name: " + this.getPiece().getComponentName()
                + " and color: " + this.getPiece().getColor());
    }
}
