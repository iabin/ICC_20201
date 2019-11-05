package gui;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.Piece;
import processing.core.PApplet;
import processing.core.PImage;

public class ChessGUI extends PApplet{
    int PIXEL_SIZE = 50;
    Board board = Board.getInstance();
    PImage black_rook;
    public static void main(String[] args) {
        PApplet.main("gui.ChessGUI");
    }

    @Override
    public void settings(){
        size(400,400);
    }

    @Override
    public void setup(){
        System.out.println(board.toString());
        black_rook = loadImage(getClass().getResource("/black-rook-50.png").getPath());
    }

    @Override
    public void draw(){
        drawBoard();
        
    }

    public void drawBoard(){
        for (int i = 0; i < board.getSize();i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if(i%2==0){
                    if(j%2==0)fill(10,108,3);
                    else fill(255,255,255);
                }else{
                    if(j%2==0)fill(255,255,255);
                    else fill(10,108,3);
                }
                rect(i*PIXEL_SIZE,j*PIXEL_SIZE,PIXEL_SIZE,PIXEL_SIZE);
                Piece p = board.getPiece(new Position(i, j));
                drawPiece(p);
            }
        }
    }

    public void drawPiece(Piece p){
        int x = p.getPosition().getX();
        int y = p.getPosition().getY();
        switch (p.getType()) {
            case ROOK:
                image(black_rook,x,y);
                break;
            case EMPTY:
                break;
            default:
                break;
        }
    }

}