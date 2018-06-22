/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

/**
 *
 * @author mike
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 60;
        
        if (x == 10) {
            System.out.println("X igual a 10\n");
        }else if(x == 20){
            System.out.println("X igual a 20\n");
        }else if(x == 30){
            System.out.println("X igual a 30\n");         
        }else{
            System.out.println("X no es igual ni a 10, ni a 20 ni 30\n");
        }
    }
    
}
