package goodway;

public class Main {

    public static void main(String[] args) {
        System.out.println("From good way");

        Piece rook = new Piece("Rook", "Black");
        BoardBlock block = new BoardBlock("Block", "White", rook);

        Visitor v = new ConsoleVisitor();
        block.accept(v);
    }
}
