public class Doctor extends Persona implements Durmiente{

    /**
     * construsctor
     * @param nombre recibe un nombre
     */
    public Doctor(String nombre){
        super(nombre);
    }

    public void existir(String g, String h, String l){

    }
    @Override
    public void dormir(){
        System.out.println("Soy doctor y estoy mimido");
    }
    
    @Override
    public void saluda(){
        System.out.println("Hola soy el Doctor "+this.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Doctor){
            Doctor d = (Doctor)obj;
            return (d.nombre.equals(this.nombre))?true:false;
        }else return false;
    }
}