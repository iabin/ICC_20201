import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.Paths;

public class Writter {
    public interface Minuscula{
        public void minus(String g);
    }
    

    public static void main(String... args)  throws IOException {
        try {
            int i = 5 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Dividiste entre 0");
        }
        // Path path = Files.createTempFile("hola", ".txt");
        // write
        // Files.write(path, "line 1\nline 2\n".getBytes());
        // read all lines
        
       
        try{
            List<String> lines = Files.readAllLines(Paths.get("csv.txt"));
            //Minuscula m = (String g)->{System.out.println( g.toUpperCase());};
            //lines.forEach(m::minus);
            //System.out.println();
            for (String string : lines) {
                String row[] = string.split(",");
                System.out.println("x: "+row[0]+" y: "+row[1]);
            }
            //lines.forEach(System.out::println);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}