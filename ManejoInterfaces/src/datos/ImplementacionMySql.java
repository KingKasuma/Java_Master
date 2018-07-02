/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author mike
 */
public class ImplementacionMySql implements AccesoDatos{
    
    @Override
    public void insertar(){
        System.out.println("Insertar desde Mysql");
    }
    
    @Override
    
    public void listar(){
        System.out.println("Listar desde MySql");
    }
    
}
