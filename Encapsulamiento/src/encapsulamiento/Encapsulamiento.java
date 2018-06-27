/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author mike
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el objeto
        Persona p1 = new Persona("Juan","Perez",false);
        //Accedems al atributo nombre
        System.out.println("Nombre de p1: "+p1.getNombre());
        
        //Creamos el objeto
        Persona p2 = new Persona("Karla","Gonzales",false);
        //Imprimimos el estad completo del objeto
        System.out.println("Estado objeto p2:"+p2);
        
        //Marcamos como eliminada a la persona
        p2.setBorrado(true);
        //Imprimimos el estado completo del objeto
        System.out.println("Estado objeto p2:"+p2);
        
        //Creamos un tercer objeto vacio
        Persona p3 = new Persona();
        //Imprimimos el estado completo del objeto
        System.out.println("Estado objeto p3:"+p3);
    }     
}
