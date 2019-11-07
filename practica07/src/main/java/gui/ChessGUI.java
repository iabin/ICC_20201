package gui;
import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import processing.core.PApplet;
import processing.core.PImage;

public class ChessGUI extends PApplet{
    Piece selected = null;
    boolean isSelected = false;
    int PIXEL_SIZE = 50;
    List<Position> legalMoves = new LinkedList<>();
    Board board = Board.getInstance();
    PImage black_rook;
    PImage white_rook;
    public static void main(String[] args) {
        PApplet.main("gui.ChessGUI");
    }

    @Override
    public void settings(){
        size(400,400);
    }

    @Override
    public void setup(){
        //legalMoves = board.getPiece(new Position(4,4)).getLegalMoves();
        System.out.println(board.getPiece(new Position(4,4)).getLegalMoves());
        black_rook = loadImage(getClass().getResource("/black-rook-50.png").getPath());
        white_rook = loadImage(getClass().getResource("/white-rook-50.png").getPath());
    }

    @Override
    public void draw(){
        drawBoard();
        drawPosibleMoves();
    }
    public void drawPosibleMoves(){
        stroke(255,0,0);
        fill(0,0,0,100);
        for(Position g:legalMoves){
            int x = g.getX();
            int y = g.getY();
            rect(x*PIXEL_SIZE,y*PIXEL_SIZE,PIXEL_SIZE,PIXEL_SIZE);
        }
        stroke(0,0,0);
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
                if(p.getColor().equals(ColorEnum.WHITE))
                    image(white_rook,x*PIXEL_SIZE,y*PIXEL_SIZE);
                if(p.getColor().equals(ColorEnum.BLACK))
                    image(black_rook,x*PIXEL_SIZE,y*PIXEL_SIZE);
                break;
            case EMPTY:
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseClicked(){
        int x = mouseX/PIXEL_SIZE;
        int y = mouseY/PIXEL_SIZE;
        Piece p = board.getPiece(new Position(x,y));
        this.legalMoves = p.getLegalMoves();
        if(selected==null){
            selected = p;
            return;
        }else {
            //this.selected.moveTo(new Position(x, y));
            selected = null;
        }


        
        System.out.println(x);
        System.out.println(y);
    }

}