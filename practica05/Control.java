import java.util.ArrayList;
import java.util.Arrays;

public class Control{

    
    public static boolean problema1(String palabra){
        return true;
    }
    
    public static boolean problema2(int[] arreglo, int k){
        return false;
    }
    
    public static void problema3(int[] arreglo){
        return;
    }
    
    public static boolean problema4(int[] arreglo, int buscando){
        return true;
    }

    public static boolean problema5(int n){
        if(n == 1) return false;
        for(int i = 2; i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    
    public static int[] problema6(int n){        
    }


    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }

}