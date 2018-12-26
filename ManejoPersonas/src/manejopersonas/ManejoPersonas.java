/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;
import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;
/**
 *
 * @author Mike
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonasJDBC personasJDBC = new PersonasJDBC();
        //Prueba del metodo insert
        //personasJDBC.insert("Alberto", "Juarez");
        
        //Prueba del metodo update
        //personasJDBC.update(4, "Adalberto", "Orellana");
        
        //Prueba del metodo delete
        personasJDBC.delete(4);
        
        //Prueba del metodo select
        //Uso de un objeto persona para encapsular la informacion
        //de un registro de base de datos
        List<Persona> personas = personasJDBC.select();
        for(Persona persona : personas){
            System.out.println(persona);
            System.out.println("");
        }
    }
    
}
