/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;




   
public class Lavadora extends Electrodomestico{
   
    int carga=5;

    
    
    
    
    
    
   
    public Lavadora(int preciobase, int peso) {
        super(preciobase, peso);
        carga = 5;
    }

    public Lavadora(int preciobase, String color, String consumo, int peso, int carga) {
        super(preciobase, color, consumo, peso);
        this.carga = carga;

    }

}

