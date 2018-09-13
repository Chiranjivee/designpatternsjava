package badway;

public class Main {

    public static void main(String[] args) {
        System.out.println("From bad way.");
        Piece piece = new Piece("Rook", "Black");
        BoardBlock blackBlock =
                new BoardBlock("BlackBlock", "Black", piece);

        blackBlock.visit();
    }

}
