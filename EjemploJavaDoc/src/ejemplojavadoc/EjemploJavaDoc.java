/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavadoc;

/**
 *
 * @author mike
 */

import com.gm.javadoc.Aritmetica;

/**
 * 
 * Clase para probar el concepto de JavaDoc
 * @author Mike
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * Metodo que ejecuta la prueba de la clase Artimetica
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        int resultado = new Aritmetica(3,2).sumar();
        System.out.println("resultado:"+resultado);
    }
    
}
