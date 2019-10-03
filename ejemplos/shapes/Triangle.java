package shapes;

import geometria.Triangulo;

public class Triangle{
    public Vector2 a;
    public Vector2 b;
    public Vector2 c;


    /**
     * Constructor que genera un triangulo con 3 puntos dados
     * @param a punto a
     * @param b punto b
     * @param c punto c
     */
    public Triangle(Vector2 a, Vector2 b, Vector2 c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

     /**
      * regresa la representación de sierpinsky
      * @param n el número de iteraciones
      * @return la representación
      */
    public String sierpinsky(int n){
        if(n == 0)return "";//Caso base
        Triangle aux1 = new Triangle(this.a, this.a.middlePoint(b), this.a.middlePoint(c));
        Triangle aux2 = new Triangle(this.b, this.b.middlePoint(a), this.b.middlePoint(c));
        Triangle aux3 = new Triangle(this.c, this.c.middlePoint(a), this.c.middlePoint(b));
        String resul = this.toSVG() + " " + aux1.sierpinsky(n-1)+ " "+aux2.sierpinsky(n-1)+" "+aux3.sierpinsky(n-1)+" ";
        return resul;
    }

    /**
     * Regresa la cadena como un svg
     * @return
     */
    public String toSVG(){
        String aux = "<polygon points='"+Double.toString(this.a.x)+" "+Double.toString(this.a.y)+" "+Double.toString(this.b.x)+" "+Double.toString(this.b.y)+" "+Double.toString(this.c.x)+" "+Double.toString(this.c.y)+"' stroke='black' fill='transparent' stroke-width='2'/>";
        return aux;
    }
}