/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author mike
 */
public class Persona {
    //Atributos de una clase
    //No es necesario asignar valores
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    
    //Metodos de la clase
    //Los usaran os objetos de esta clase
    public void desplegarNombre(){
        System.out.println("Nombre : "+nombre);
        System.out.println("Apellido Paterno : "+apellidoPaterno);
        System.out.println("Apellido Materno : "+apellidoMaterno);
    }
}
