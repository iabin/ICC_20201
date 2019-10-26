public abstract class Entrada{
    //private
    //package protected
    //protected
    //public
    public abstract void holaMundo();

    public static void main(String[] args) {
        if(args.length >= 1){
            if(args[0].equals("-v"))
                System.out.println("Verbose");
        }
    }
}