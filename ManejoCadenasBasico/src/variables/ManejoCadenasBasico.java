/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Mike_King
 */
public class ManejoCadenasBasico {
    public static void main(String[] args){
        String nombre = "Karla";
        String apellido = "Esparza";
        System.out.println("Concatenacion:"+nombre+apellido);
        System.out.println("Nueva linea: \n"+nombre+" "+apellido);
        System.out.println("Tabulador: \t"+nombre+" "+apellido);
        System.out.println("Retroceso: \b"+nombre+" "+apellido);
        System.out.println("Retroceso de carro: \r"+nombre+" "+apellido);
        System.out.println("Comilla simple: \'"+nombre+" "+apellido);
        System.out.println("Comilla doble: \""+nombre+" "+apellido);
    }
}
