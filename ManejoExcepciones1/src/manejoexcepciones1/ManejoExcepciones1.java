/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones1;

/**
 *
 * @author mike
 */

import domain.*;

public class ManejoExcepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Division division = new Division(10,0);
            division.visualizarOperacion();
        }catch(OperationException oe){
            System.out.println("Ocurrio un error!!!");
            oe.printStackTrace();
        }
    }
    
}
