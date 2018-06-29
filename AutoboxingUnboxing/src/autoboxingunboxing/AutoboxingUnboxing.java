/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingunboxing;

/**
 *
 * @author mike
 */
public class AutoboxingUnboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Autboxing (se convierten de tipos primitivos a tipos Object)
        Integer enteroObj = 10;
        Float flotanteObj = 15.2F;
        Double doubleObj = 40.1;
        System.out.println("Autoboxing");
        System.out.println("Entero Obj:"+enteroObj.intValue());
        System.out.println("Flotante Obj:"+flotanteObj.floatValue());
        System.out.println("Double Obj:"+doubleObj.doubleValue());
        
        //Unboxing (se convierte de objetos a tipos primitivos)
        int entero = enteroObj;
        float flotante = flotanteObj;
        double doble = doubleObj;
        System.out.println("\nUnboxing");
        System.out.println("Entero"+entero);
        System.out.println("Flotante:"+flotante);
        System.out.println("Double:"+doble);
    }
    
}
