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
public class Caja {
    int alto;
    int ancho;
    int profundo;
    
    Caja(){}
    
    Caja(int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    int volumen(){
        int vol = alto * ancho * profundo;
        return vol; 
    }
}
