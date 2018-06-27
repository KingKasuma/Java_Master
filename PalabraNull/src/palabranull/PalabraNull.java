/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabranull;

/**
 *
 * @author mike
 */
public class PalabraNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        System.out.println("Nombre p1:"+p1.obtenerNombre());
        
        Persona p2 = p1; //p2 apunta al mismo objeto que p1
        System.out.println("Nombre p2:"+p2.obtenerNombre());
        
        //Hacemos que p1 ya no apunte al objeto p1
        p1 = null;
        
        //Comprobamos que p2 sigue accediendo al objeto
        System.out.println("Nombre p2:"+p2.obtenerNombre());
        
        //La siguiente linea marca error de tipo NullPointerException
        //System.out.println("Nombre p1:"+p1.obtenerNombre());
        //Solo en caso de que no sea nulo podemos utilizar este metodo en esta variable
        if(p1 != null){
            System.out.println("Nombre p1:"+p1.obtenerNombre());
        }            
    }
    
    static class Persona{
        String nombre; //valor por default es null
        
        public Persona(String nombre){
            this.nombre = nombre;
        }
        
        public String obtenerNombre(){
            return this.nombre; //Uso opcional de this
        }
    }
    
}
