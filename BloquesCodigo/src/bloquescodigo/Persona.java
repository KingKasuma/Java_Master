/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloquescodigo;

/**
 *
 * @author mike
 */
public class Persona {
    public final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de inicializacion estatico
    static{
        //Iniciamos el idPesonas desde el valor 10
        contadorPersonas = 10;
        //Aqui no se pueden usar variables no estaticas
        //idPersona = 1;
        System.out.println("Ejecuta bloque estatico");
    }
    
    //Bloque de codigo para inicializar atributos de la clase 
    //El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona = ++contadorPersonas;
    }
    
    Persona(){
        System.out.println("Ejecuta Constructor");
    }
    
    public int getIdPersona(){
        return idPersona;
    }
}
