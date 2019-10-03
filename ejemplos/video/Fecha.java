//paquete
//imports
//Clase
//Atributos privados
//Atributos publicos
//Constructor
//Métodos

/**
*Clase que modela fechas
*/
public class Fecha{
    private int second;
    private int minute;
    private int hour;
    private int year;
    private int month;
    private int day;

    //public nombreClase(lo que recibe)
    /**
    * Constructor de la clase fecha
    *@param day el día
    *@param month el mes
    *@param year el año
    */
    public Fecha(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int diferencia(Fecha f){
        return Math.abs(f.getYear() - this.year);
    }

    //public regresa nombre(parametros)
    @Override
    public String toString(){
        String resultado = "Año: "+Integer.toString(this.year);
        resultado = resultado+" Mes: "+Integer.toString(this.month);
        resultado =resultado+" Día: "+Integer.toString(this.day);
        return resultado;
    }

    public int getYear(){
        return this.year;
    }


}
