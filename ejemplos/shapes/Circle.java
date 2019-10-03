package shapes;
public class Circle{
    private double radio;
    private Vector2 centro;
    private double area;

    public Circle(){
        this.radio = 1;
        this.centro = new Vector2(0, 0);
        this.area = Math.PI;
    }

    public Circle(Vector2 centro, double radio){
        this.centro = centro;
        this.radio = radio;
        this.area = Math.PI * this.radio * this.radio;
    }

    public double getArea(){
        return this.area;
    }

    public String toSVG(){
        return "<circle cx='"+this.centro.x+"' cy='"+this.centro.y+"' r='"+this.radio+"'/>";
    }

}