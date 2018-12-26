/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejousuarios;
import datos.UsuariosJDBC;
import domain.Usuario;
import java.util.List;
/**
 *
 * @author Mike
 */
public class ManejoUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsuariosJDBC usuarioJDBC = new UsuariosJDBC();
        //Prueba del metodo insert
        //usuarioJDBC.insert("Mike", "123456");
        
        //Prueba del metodo update
        //usuarioJDBC.update(2, "Michael", "654321");
        
        //Prueba del metodo delete
        usuarioJDBC.delete(2);
        
        //Prueba del metodo select
        //Uso de un objeto persona para encapsular la informacion
        //de un registro de base de datos
        List<Usuario> usuarios = usuarioJDBC.select();
        for(Usuario usuario : usuarios){
            System.out.println(usuario);
            System.out.println("");
        }
    }
    
}
