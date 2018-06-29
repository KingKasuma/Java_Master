/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author mike
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un arregl de Personas
        Persona personas [] = {new Persona("Juan"), new Persona("Karla")};
        
        //Iterams cada elemento del arreglo de personas
        for (Persona p:personas){
            //Accedemos a las propiedades y/o metodos del objeto
            String nombre = p.getNombre();
            System.out.println("Nombre persona:"+nombre);
        }
        
        System.out.println("");
        //creamos un arreglo de enteros
        int edades [] = {15,20,41,50};
        //Iteramos el arreglo
        for(int edad: edades){
            System.out.println("Edad:"+edad);
        }
    }
    
}
