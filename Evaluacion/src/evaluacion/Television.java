
package evaluacion;

 
public class Television extends Electrodomestico{
   
    int resolucion = 20;
    boolean sintonizador = false;

  
   
    public Television (int preciobase, int peso) {
        super(preciobase, peso);
        resolucion = 20;
        sintonizador = false;
       
    }
       
         public Television(int preciobase, String color, String consumo, int peso, int resolucion, boolean sintonizador) {
        super(preciobase, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getresolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
   
   
}

