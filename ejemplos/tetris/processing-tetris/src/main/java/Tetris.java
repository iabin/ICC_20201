import processing.core.PApplet;
import processing.sound.SoundFile;

public class Tetris extends PApplet {

    public static void main(String[] args) {
        main(Tetris.class);
    }

    public void settings() {
        size(300, 300);
    }

    public void setup() {
        background(255);
        noLoop();
        SoundFile soundFile = new SoundFile(this, getClass().getResource("/Tetris.mp3").getPath());
        soundFile.loop();
    }

    public void draw() {}
    
}