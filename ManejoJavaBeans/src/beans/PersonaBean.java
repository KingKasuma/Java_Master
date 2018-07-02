/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author mike
 */

import java.io.Serializable;

//1. Implementa la interface Serializable
//del paquete java.io
public class PersonaBean implements Serializable{
    
    //2. Cada propiedad es de tipo private
    private String nombre;
    private int edad;
    
    //3. Siempre tiene un Constructor sin argumetos
    public PersonaBean(){        
    }
    
    //Constructor del JavaBean (NO REQUERIDO)
    public PersonaBean(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //4. Por cada propiedad agrega un get y un set
    //o solo algun de ellos
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
}
