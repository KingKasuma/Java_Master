/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresacceso;

/**
 *
 * @author mike
 */
import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

public class ModificadoresAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba de accesos a Clase1 desde otras clases
        //Acceso a Clase 1 desde Clase 2
        System.out.println("***Acceso desde Clase 2 a Clase 1 (mismo paquete)***");
        new Clase2().pruebaDesdeClase2();
        
        //Acceso a Clase 1 desde Clase 2
        //Clase 3 extiende de Clase 1
        System.out.println("\n***Acceso desde Clase 3 a Clase 1 (diferente paquete, pero es subclase)***");
        new Clase3().pruebaDesdeClase3();
        
        //Acceso a Clase 1 desde Clase 4
        //Clase 4 NO es subclase y esta en otro paquete
        System.out.println("\n***Acceso desde Clase 4 a Clase 1 (diferente paquete, NO es subclase)***");
        new Clase4().pruebaDesdeClase4();
    }
    
}
