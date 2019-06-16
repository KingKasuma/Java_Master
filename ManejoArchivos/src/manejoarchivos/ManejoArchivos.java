/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import static utileria.Archivos.*;

/**
 *
 * @author Mike
 */
public class ManejoArchivos {

    //Nota: Ya debe estar creada la carpeta sobrela que se va a trabajar
    //Y en caso necesario se deben asignar permisos de escritura a la carpeta
    private static final String NOMBRE_ARCHIVO = "/media/mike/Projects/own/Backend/Java/Udemy/Java_Master/ManejoArchivos/pruebaJava.txt";
    
    public static void main(String[] args) {
        //Crear un archivo
        crearArchivo(NOMBRE_ARCHIVO);
        
        //Escribir a un archivo
        escribirArchivo(NOMBRE_ARCHIVO);
        
        //Leer de un archivo
        leerArchivo(NOMBRE_ARCHIVO);
        
        //Anexar informacion a un archivo
        anexarArchivo(NOMBRE_ARCHIVO);
        
        //Leer de un archivo
        leerArchivo(NOMBRE_ARCHIVO);
    }
    
}
