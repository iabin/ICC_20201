package paquete;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        Libro libro = new Libro("Soy un libro","Pepe pecas",new Date());
        System.out.println(libro.toString());
        System.err.println(libro.buscar("pepe"));
        
    }
}