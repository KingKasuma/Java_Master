/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author mike
 */
public class Prueba {
    public static void main(String args[]){
        Caja cubo = new Caja(2,3,6);
        int volumen  = cubo.volumen();
        System.out.println("\nEl volumen del cubo es: "+volumen);
    }
}
