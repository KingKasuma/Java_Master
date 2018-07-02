/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejojavabeans;

/**
 *
 * @author mike
 */

import beans.PersonaBean;

public class ManejoJavaBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("Juan");
        bean.setEdad(29);
        
        System.out.println("Nombre:"+bean.getNombre());
        System.out.println("Edad:"+bean.getEdad());
    }
    
}
