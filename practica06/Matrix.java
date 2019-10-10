public class Matrix{

    //Construye una matriz vacia de n por m
    public Matrix(int n, int m){}
    //Construye una matriz dado un arreglo
    public Matrix(double[][] array){}
    //Función que calcula producto escalar
    public void scalarProduct(double scalar){}
    //Función que calcula suma de matrices
    public void add(Matrix m){}
    //Función que calcula producto de matrices
    public void matrixProduct(Matrix m){}
    //Función que obtiene el elemento i j
    public double getElement(int i, int j){return 0;}
    //function set element
    public void setElement(int i, int j,double e){}
    //Función que calcula el determinante si es nxn
    public int determinant(){return 0;}
    //Función que te dice si 2 matrices son iguales
    @Override
    public boolean equals(Object o){return false;}
}