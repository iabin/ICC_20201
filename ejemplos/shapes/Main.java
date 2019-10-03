
package shapes;



public class Main{

    public static void main(String[] args){
        String inicio = "<svg height='700' width='700'>";
        String cierre = "</svg>";
    
        Triangle t = new Triangle(new Vector2(10, 529.61), new Vector2(610, 529.61), new Vector2(310, 10));

        System.out.println(inicio);
        System.out.println(t.sierpinsky(7));
        System.out.println(cierre);
        
    }
}