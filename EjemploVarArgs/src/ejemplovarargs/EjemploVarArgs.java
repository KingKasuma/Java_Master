/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovarargs;

/**
 *
 * @author mike
 */
public class EjemploVarArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimimos varios numeros
        imprimirNumeros(15,20,3,61,75,18,10);
        
        System.out.println("");
        imprimirNumerosForEach(15,20,3,61,75,18,10);
        
        System.out.println("");
        variosParametros("Juan",true,15,20,14);                
    }
    
    public static void imprimirNumeros(int... numeros) {
        //Recorremos cada elemento
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            elemento = numeros[i];
            System.out.println("Elemeto " + i + ": " + elemento);
        }
    }
    
    public static void imprimirNumerosForEach(int... numeros){
        //Usamos un forEach en lugar de un for normal
        for(int numero:numeros){
            System.out.println("El numero es:"+numero);
        }        
    }
    
    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println("Nombre: "+nombre);
        
        System.out.println("Nombre: "+valido);
        
        //Usamos un forEach
        for(int numero:numeros){
            System.out.println("El numero es:"+numero);
        }
    }
    
}
