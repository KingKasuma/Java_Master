/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto.domain;

/**
 *
 * @author mike
 */
public class Triangulo extends FiguraGeometrica{
    
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    public void dibujar(){
        //Implementacion del metodo dibujar heredado de la clase FiguraGeometrica
        System.out.println("Aqui deberia dibujar un:"+this.getClass().getSimpleName());
    }
}
