package shapes;
/**
 * Clase que modela un vector
 */
public class Vector2{
    public double x;
    public double y;

    public Vector2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector2 middlePoint(Vector2 v){
        double newX = (this.x+v.x)/2;
        double newY = (this.y+v.y)/2;
        return new Vector2(newX, newY);
    }

}