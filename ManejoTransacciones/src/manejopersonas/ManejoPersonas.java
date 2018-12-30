/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;

import datos.Conexion;
import datos.PersonasJDBC;
import java.sql.*;

/**
 *
 * @author Mike
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        PersonasJDBC personasJDBC = new PersonasJDBC();
        
        //Creamos un objeto conexion, se va a compartir
        //para todos los queries que ejecutamos
        Connection conn = null;
        
        try{
            conn = Conexion.getConnection();
            //Revisamos la conexion esta en moco autocommint
            //por default es autocommit == true
            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            //proporcionamos la conexion creada
            PersonasJDBC personas = new PersonasJDBC(conn);
            //empezamos a ejecutar sentencias
            //recordar que una transaccion agrupa varias
            //sentencias SQL
            //si algo falla no se realizan los cambios en la BD
            //cambio correcto
            personas.update(2, "Regreso2", "Regreso");
            
            //Provocamos un error superando los 45 caracteres
            //del campo de apellido
            personas.insert("Miguel2", "Ayala1231231231231231231231231231231231231231231231231231123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123");
            //guardamos los cambios
            conn.commit();
        }catch(SQLException e){
            //Hacemos rollback en caso de error
            try{
                System.out.println("Entramos al rollback");
                //Imprimimos la excepcion a la consola
                e.printStackTrace();
                //Hacemos rollback
                conn.rollback();
            }catch(SQLException e1){
                e1.printStackTrace(System.out);
            }
        }        
    }
    
}
