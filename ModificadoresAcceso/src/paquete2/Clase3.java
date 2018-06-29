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

public class Clase3 extends Clase1{
    
    public Clase3(){
        //Constructor protegido, al ser una subclase puede acceder
        //aunque este en otro paquete
        super(1,2);
        //Acceso package, y al estar fuera de paquete esta restringido
        //super(1,2,3)
        //Acceso privado, restringido
        //super(1,2,3,4);
    }
    
    public void pruebaDesdeClase3(){
        //Acceso de Clase 1 desde Clase2
        //Clase 3 extiende de Clase 1
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico:"+c1.atrPublico+" o heredado:"+atrPublico);
        System.out.println("Atributo protegido (heredado):"+atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acces negado");
        
        //Constructor publico
        new Clase1();
        //Los demas constructores no se pueden probar asi, sino desde el constructor de esta clase
        //Ya que esta es una subclase en otro paquete
        
        System.out.println("");
        System.out.println("Metodo publico:"+c1.metodoPublico());
        System.out.println("Metodo protedigo (heredado):"+metodoProtegido());
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso negado");
    }
}
