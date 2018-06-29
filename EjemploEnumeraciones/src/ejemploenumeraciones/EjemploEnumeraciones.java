/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenumeraciones;

/**
 *
 * @author mike
 */
public class EjemploEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Valores de la enumeracion
        System.out.println("Valor 1:"+Dias.LUNES);
        
        //Hacemos un test del dia utilizado
        indicarDia(Dias.VIERNES);
        
        //Utilizamos la enumeracion de paises
        System.out.println("Continente no. 4: "+Continentes.AMERICA);
        System.out.println("Paises en America: "+Continentes.AMERICA.getPaises());
        
        //Hacemos el test del numero de paises por continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        
        //Imprimimos los continentes
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void indicarDia(Dias dias){
        switch(dias){
            //Podemos usar algun valor constante de la enumeracion directamente
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            default:
                System.out.println("Y asi seguimos con los demas dias");
        }
    }
    
    public static void indicarPaises(Continentes continentes){
        switch(continentes){
            //Podemos usar algun valor constante
            //de la enumeracion directamente
            case AFRICA:
                System.out.println("No. Paises en:"+continentes+": "+continentes.getPaises());
                break;
            default:
                System.out.println("Y asi seguimos con los demas continentes");
        }
    }
    
    public static void imprimirContinentes(){
        //Utilizamos un forEach
        for(Continentes c:Continentes.values()){
            System.out.println("Continente:"+c+" contiene "+c.getPaises()+" paises.");
        }
    }
    
}
