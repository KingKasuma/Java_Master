/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploinstanceof;

/**
 *
 * @author mike
 */
public class EjemploInstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraGeometrica figura;
        figura = new Elipse();
        //Determina solo un tipo el que corresponda con la jerarquia
        determinaTipo(figura);
        //Determina todos los tipos posibles
        System.out.println("\nTodos sus tipos");
        determinaTodosLosTipos(figura);
    }
    
    private static void determinaTodosLosTipos(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }
        if (figura instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un circulo");
        }
        if (figura instanceof FiguraGeometrica) {
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        }
        if (figura instanceof Object) {
            //Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        }else{
            System.out.println("No se encontro el tipo");
        }
    }
    
    private static void determinaTipo(FiguraGeometrica figura){
        if(figura instanceof Elipse){
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }else if(figura instanceof Circulo){
            //Procesa algo particular del Circulo
        }else if(figura instanceof FiguraGeometrica){
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        }else if(figura instanceof Object){
            //Procesa algo particular de la clase Object
            System.out.println("Es un object");
        }else{
            System.out.println("No se encontro el tipo");
        }
    }
    
}
