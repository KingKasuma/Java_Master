/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturnclases;

/**
 *
 * @author mike
 */
public class PalabraReturnClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
        int resultado = s.a + s.b;
        System.out.println("Resultado:"+resultado);
    }
    
    public static Suma creaObjetoSuma(){
        Suma s = new Suma(3,4);
        return s;     
    }
    
    static class Suma{
        int a;
        int b;
        
        Suma(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    
}
