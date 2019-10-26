import processing.core.PApplet;
import processing.core.PImage;
public class ProcessingAdapter{
    private static ProcessingAdapter instance = null;
    private PApplet papplet;
    
    private ProcessingAdapter(PApplet p){
        this.papplet = p;
        instance = this;
    }


    public static ProcessingAdapter init(PApplet p){
        if(instance == null)
            instance = new ProcessingAdapter(p);
        return instance;
    }

    public static ProcessingAdapter getInstance(){
        return instance;
    }


   

    public void fill(int r,int g, int b){
        papplet.fill(r,g,b);
    }

    public void rect(float x, float y, int width, int height){
        papplet.rect(x,y,width,height);
    }
}

