/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author mike
 */
import paquete1.Clase1;
public class Clase4 {
    public Clase4(){
        //Constructor protegido, restringido al no ser una subclase
        //super(1,2);
        //Acceso package, y al estar fuera de paquete esta restringido
        //super(1,2,3);
        //Acceso privado, restringido
        //super(1,2,3,4);
    }
    
    public void pruebaDesdeClase4(){
        //Acces a Clase 1 desde Clase 4
        //Clase4 no es subclase y esta en otro paquete
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico:"+c1.atrPublico);
        System.out.println("Atributo protegido: no se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acceso negado");
        
        //Constructor publico
        new Clase1();
        //los demas constructores estan restringidos
        System.out.println("");
        System.out.println("Metodo publico:"+c1.metodoPublico());
        System.out.println("Metodo protegido: No se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso negado");
    }
}
