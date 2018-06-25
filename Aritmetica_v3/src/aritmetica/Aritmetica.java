/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author mike
 */
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor Vacio
    //Recordar que si agregamos un constructor distinto al vacio
    //Ya no se crea este constructor y nosotros debemos crearlo si lo necesitamos
    Aritmetica(){}
    
    //Constructor con 2 argumentos
    Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
    }
    
    //Este metodo toma los atributos de la clase para hacer la suma
    int sumar(){
        return a + b;
    }
    
    //Metodo restar
    int restar(){
        return a - b;
    }
    
    //Metodo multiplicar
    int multiplicar(){
        return a * b;
    }
    
    //Metodo dividir
    int dividir(){
        return a / b;
    }
}
