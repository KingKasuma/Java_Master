/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

/**
 *
 * @author mike
 */
public class ClaseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan",10000);
        Empleado emp2 = new Empleado("Juan",10000);
        
        compararObjetos(emp1,emp2);
    }
    
    private static void compararObjetos(Empleado emp1, Empleado emp2){
        //Llamada metodo toString
        //Por default se manda llamar el metodo toString dentro de println
        System.out.println("Contenido objeto:"+emp1);
        
        //Revision por referencia
        if(emp1 == emp2){
            System.out.println("Los objetos tiene misma direccion de memoria");                       
        }else{
            System.out.println("Los objetos tiene distancia direccion de memoria");
        }
        
        //Revision por el metodo equals
        if(emp1.equals(emp2)){
            System.out.println("Los objetos tienen el mismo contenido, son iguales");
        }else{
            System.out.println("Los objetos NO tienen el mismo contenido, NO son iguales");
        }
        
        //Revisamos el metodo hashCode
        if (emp1.hashCode() == emp2.hashCode()) {
            System.out.println("Los objetos tienen el mismo codigo hash");
        }else{
            System.out.println("Los objetos NO tienen el mismo codigo hash");
        }
    }
    
}
