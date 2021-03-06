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

import excepciones.*;

public class ImplementacionMySql implements AccesoDatos{
    
    private boolean simularError;
    
    @Override
    public void insertar() throws AccesoDatosEx{
        if (simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        }else{
            System.out.println("Insertar desde MySql");
        }
    }
    
    @Override
    public void listar() throws AccesoDatosEx{
        if (simularError) {
            throw new LecturaDatosEx("Error de lectura de datos");   
        }else{
            System.out.println("Listar desde MySql");
        }
    }
    
    public boolean isSimularError(){
        return simularError;
    }
    
    @Override
    public void simularError(boolean simularError){
        this.simularError = simularError;
    }
    
}
