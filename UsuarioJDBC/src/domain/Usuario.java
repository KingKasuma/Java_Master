/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Mike
 */
public class Usuario {
    private int id_usuario;
    private String usuario;
    private String password;
    
    public int getId_usuario(){
        return id_usuario;
    }
    
    public void setId_usuario(int idUsuario){
        id_usuario = idUsuario;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    @Override 
    public String toString(){
        return "Usuario{"+"id_usuario="+id_usuario+", usuario="+usuario+", password="+password+"}";
    }
}
