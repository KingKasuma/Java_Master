/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

/**
 *
 * @author mike
 */
public class PasoPorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        p.cambiarNombre("Juan");
        imprimirNombre(p); //Imprime Juan
        modificarPersona(p);
        imprimirNombre(p); //Imprime Carlos
    }
    
    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("Carlos");
    }
    
    public static void imprimirNombre(Persona p){
        System.out.println("Valor recibido :"+p.obtenerNombre());
    }
}
