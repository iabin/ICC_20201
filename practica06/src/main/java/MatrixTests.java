public class MatrixTests{
    public static void scalarProduct_test(){
        System.out.println("scalar product failed");
    }
    public static void add_test(){
        System.out.println("addition failed");
    }
    public static void matrixProduct_test(){
        System.out.println("matrix product failed");
    }
    public static void setElement_test(){
        System.out.println("setElement failed");
    }
    public static void getElement_test(){
        System.out.println("Get element failed");
    }
    public static void determinant_test(){
        System.out.println("Determinant failed");
    }
    public static void equals_test(){
        System.out.println("equals failed");
    }

    public static int fibb(int n){
        if(n==0)return 1;
        if(n==1)return 1;
        return fibb(n-1)+fibb(n-2);
    }

    public static int fac(int n){
        if(n == 1)return 1;
        return fac(n-1)*n;
    }

    public static void main(String[] args) {
        scalarProduct_test();
        add_test();
        matrixProduct_test();
        setElement_test();
        getElement_test();
        determinant_test();
        equals_test();
        int m[][] = new int[8][8];
       System.out.println(fac(15));

    }
}