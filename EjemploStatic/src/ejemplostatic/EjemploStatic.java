/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostatic;

/**
 *
 * @author mike
 */
public class EjemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        System.out.println("Persona1: "+p1);
        
        Persona p2 = new Persona("Karla");
        System.out.println("Persona2: "+p2);
        
        //Imprimimos el contadorPersonas
        System.out.println("No. Personas:"+Persona.getContadorPersonas());
    }
    
}
