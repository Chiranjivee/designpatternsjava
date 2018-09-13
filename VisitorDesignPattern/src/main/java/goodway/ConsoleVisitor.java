package goodway;

public class ConsoleVisitor implements Visitor {
    @Override
    public void visitPiece(Piece p) {
        System.out.println("Visiting: " + p.getComponentName() +
                ", color: " + p.getColor());
    }

    @Override
    public void visitBlock(BoardBlock b) {
        System.out.println("Visiting: " + b.getComponentName() +
                ". This board has " + b.getBlockColor() +
                " and a piece with name: " + b.getPiece().getComponentName()
                + " and color: " + b.getPiece().getColor());
    }
}
