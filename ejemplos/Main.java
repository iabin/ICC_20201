import java.util.Date;

public class Main{
    public static void main(String[] args) {
        Libreria ghandi = new Libreria();
        ghandi.nombreDelLocal = "ghandi";
        for(int i =0;i < 1000000;i++){
            Libro libro1 = new Libro("Libro"+Integer.toString(i),"Autor"+Integer.toString(i),new Date());
            ghandi.agregaUnLibro(libro1);
        }
        

        
       
    
        System.out.println(ghandi.numeroLibros());
        //System.out.println(ghandi.getListaLibros());
        System.out.println(ghandi.buscaAutor("Autor10000"));
    }
}