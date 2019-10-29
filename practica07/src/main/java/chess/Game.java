package chess;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.chessPieces.Rook;

public class Game{

    public static void main(String[] args) {
        Rook t = new Rook(new Position(4, 4),ColorEnum.BLACK);
        System.out.println(t.getLegalMoves());
    }
}