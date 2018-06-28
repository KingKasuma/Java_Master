/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.javadoc;

/**
 *Esta clase permite realizar operaciones de aritmetica como sumar, restar, etc
 * 
 * @author: mike
 * @version: 1.0
 */
public class Aritmetica {
    /**
     * Primer Operando
     */
    int operandoA;
    
    /**
     * Segundo operando
     */
    
    int operandoB;
    
    /**
     * Constructor vacio de la clase
     */
    public Aritmetica(int a, int b){        
        this.operandoA = a;
        this.operandoB = b;
    }
    
    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int resutlado de la suma
     */
    
    public int sumar(){
        return operandoA + operandoB;
    }
}
