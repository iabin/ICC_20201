import java.util.ArrayList;
public class Libreria{
    private ArrayList<Libro> listaLibros;
    private int apertura;
    public String nombreDelLocal;
    
    public Libreria(){
        this.listaLibros = new ArrayList<>();
        this.apertura = 800;
        this.nombreDelLocal = "Sin Nombre";
    }

    public ArrayList<Libro> getListaLibros(){
        return this.listaLibros;
    }

    public void agregaUnLibro(Libro e){
        this.listaLibros.add(e);
    }

    public int numeroLibros(){
        return listaLibros.size();
    }

    public Libro buscaAutor(String g){
        for(Libro l:this.listaLibros){
            if(l.nombreAutor.equals(g))
                return l;
        }
        return null;
    }
}