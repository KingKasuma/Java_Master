/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author mike
 */
public class Clase1 {
    
    //Definicion de atributos
    public int atrPublico = 5;
    protected int atrProtegido = 6;
    int atrPaquete = 7;
    private int atrPrivado = 8;
    
    //Cnstructores
    public Clase1(){        
    }
    
    public Clase1(int i){
        System.out.println("Constructor publico 1");
    }
    
    protected Clase1(int i, int j){
        System.out.println("Constructor protected 2");
    }
    
    Clase1(int i, int j, int k){
        System.out.println("Constructor package 3");
    }
    
    private Clase1(int i, int j,int k,int l){
        System.out.println("Constructor privado 4");
    }
    
    //Definicion de metodos
    public int metodoPublico(){
        return 9;
    }
    
    protected int metodoProtegido(){
        return 10;
    }
    
    int metodoPaquete(){
        return 11;
    }
    
    private int metodoPrivado(){
        return 12;
    }
}
