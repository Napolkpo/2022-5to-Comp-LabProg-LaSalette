import java.util.ArrayList;

 
public class Main (){
    public static void main(String[] args) {
        ArrayList <Empleado> lista= new ArrayList ();
        Empleado e1 = new Empleado ("Roberto", 9, 500);
        Empleado e2 = new Empleado ("Julia", 20, 1500);
        Empleado e3 = new Empleado ("Jose", 12, 1000);
        Empleado e4 = new Empleado ("Ana", 42, 5000);
        Empleado e5 = new Empleado ("Ezequiel", 60, 3500);
        lista.add (e1);
        lista.add (e2);
        lista.add (e3);
        lista.add (e4);
        lista.add (e5);
       
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).sueldoBruto());
        }
    }
}