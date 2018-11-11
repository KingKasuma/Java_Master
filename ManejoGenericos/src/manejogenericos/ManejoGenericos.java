/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenericos;

/**
 *
 * @author Mike_King
 */
public class ManejoGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos una instancia de ClaseGenerica para Integer.
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();
        
        //Creamos una instancia de ClaseGenerica para String.
        //Se puede utilizar la inferencia del tipo del lado derecho
        ClaseGenerica<String> objetoStr = new ClaseGenerica<>("Prueba");
        objetoStr.obtenerTipo();
        
        //Los genericos no pueden ser aplicados a tipos primitivos
        //Por lo que esto marcaria un erro de compilacion
        //ClaseGenerica<int> intPrimitivo = new ClaseGenerica<in>(88);
    }
    
}
