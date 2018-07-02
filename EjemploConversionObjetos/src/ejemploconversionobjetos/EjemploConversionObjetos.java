/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author Mike_King
 */
public class EjemploConversionObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Creamos un tipo de mas alta jerarquia
        Empleado empleado;
        //Asignamos una referencia de un objeto de menor jerarquia
        //Esto es upcasting, no hay necesidad de notacion especial
        empleado = new Escritor("Roy",15000,TipoEscritura.CLASICO);
        
        //Sin embargo si quisieramos acceder al detalle de la clase Escritor
        //No es posible, ya que esas caracteristicas no estan en comun
        //entre todas las clases de la jerarquia de clases
        //emp.getTipoDeEscrituraEnTexto();
        
        //Imprimimos los detalles
        imprimirDetalles(empleado);
        
        //2. Podemos hacer los mismo con la clase Gerente
        //Esto es upcasting, por lo que no requiere una sintaxis espcial
        empleado = new Gerente("Laura",18000,"Sistemas");
        
        //pero si queremos accedes directo por la variables empleado
        //al detalle del bjeto Gerente no es posible, se pierde el  acceso
        //empleado.getDepartamento();
        
        //Utilizamos el mismo metodo para imprimir los detalles
        imprimirDetalles(empleado);           
    }   
    
    //Metodo generico para imprimir los detalles de la jerarquia Empleado
        private static void imprimirDetalles(Empleado empleado){
            String resultado = null;
            
            //Imprimir detalles es general para todos ya que es por polimorfismo
            //no se necesita de nunguna conversion
            System.out.println("\nDetalle:"+empleado.obtenerDetalles());
            
            //Pero los detalles de cada clase debemos hacer un downcasting 
            if (empleado instanceof Escritor){
                //Convertimos el objeto al tipo inferior deseado
                //Convierte objeto - Downcasting
                Escritor escritor = (Escritor) empleado;
                //Finalmente podemos acceder a los metodos de la clase Escritor
                resultado = escritor.getTipoDeEscrituraEnTexto();
                
                //Otra forma es hacer la conversion en la misma linea de codigo.
                //Esto es muy comun encontrarlo en Java
                //para evitar la creacion de variables innecesarias
                resultado = ((Escritor) empleado).tipoEscritura.getDescripcion();
                
                System.out.println("resultado tipoEscritura:"+resultado);
            }else if(empleado instanceof Gerente){
                //Hacemos el downcasting en la misma linea de codigo
                //nos ahoraamos una variable
                resultado = ((Gerente) empleado).getDepartamento();
                System.out.println("resultado departamento:"+resultado);
            }
        }
}
