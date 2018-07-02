/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecciones;

/**
 *
 * @author mike
 */

import java.util.*;

public class ManejoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        
        //Elemento repetido
        miLista.add("4");
        imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //No permite elementos repetidos, lo ignora
        miSet.add("300");
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        //Llave, valor  
        miMapa.put("1","Juan");
        miMapa.put("2","Carlos");
        miMapa.put("3","Rosario");
        miMapa.put("4","Esperanza");
        //Se imprime todas las llaves
        imprimir(miMapa.keySet());
        //Se imprime todos los valores
        imprimir(miMapa.values());
    }
    
    private static void imprimir(Collection coleccion){
        for (Object elemento: coleccion) {
            System.out.print(elemento+" ");
        }
        System.out.println("");
    }
    
}
