package paquete;
import java.util.Date;

/**
 * Clase que modela un libro 
 * @author Iabin
 */
public class Libro{
    public String contenido;
    public String nombreAutor;
    public Date fechaPublicacion;
    public int edicion;

    /**
     * Constructor para libro 
     * @param contenido el contenido del libro
     * @param nombreAutor el nombre del autor
     * @param fecha la fecha del publicacion
     */
    public Libro(String contenido,String nombreAutor,Date fecha){
        this.contenido = contenido;
        this.nombreAutor = nombreAutor;
        this.fechaPublicacion = fecha;
        this.edicion = 1;
    }
    /**
     * Metodo que te dice si hay una palabra contenida 
     * en el libro o en su autor
     * @param buscando lo que voy a buscar
     * @return true si está, false en otro caso.
     */
    public boolean buscar(String buscando){
        String contenidoMin = this.contenido.toLowerCase();
        String nameMin = this.nombreAutor.toLowerCase();
        boolean res = contenidoMin.contains(buscando.toLowerCase())||nameMin.contains(buscando.toLowerCase());
        return res;
    }

    /**
     * devuelve la representacion como
     * Autor:
     * Fecha:
     */
    @Override
    public String toString(){
        String res = "Autor: ";
        res = res + nombreAutor +"\n";
        res = res + fechaPublicacion.toString() + "\n";
        return res;
    }

  
}