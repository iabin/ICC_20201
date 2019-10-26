import processing.core.PApplet;
import processing.core.PImage;
public class Sketch extends PApplet{
    ProcessingAdapter p = ProcessingAdapter.init(this);
    public Board board =  new Board(50);
    PImage pawn_img;
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
    

    public void settings(){
        size(400,400);
    }

    public void setup(){
        fill(120,50,240);
        pawn_img = loadImage(getClass().getResource("/white-pawn-50.png").getPath());
    }

    

    @Override
    public void draw(){
       board.draw();
       image(pawn_img, 0, 0);
    }
}