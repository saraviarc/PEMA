/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Roberto Mendoza
 */
public class Usuario {
    //Atributos
    private String nombre;
    private String contraseña;
    private String cargo;
    private String estado;
    private String codigoUsuario;
    
    //Método constructor por defecto
    public Usuario(){
    }
    
    public Usuario(String nombre, String contraseña,String cargo, String estado, String codigoUsuario){
        this.nombre=nombre;
        this.contraseña=contraseña;
        this.cargo=cargo;
        this.estado=estado;
        this.codigoUsuario=codigoUsuario;
    }
    //Métodos
    
    //Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
    
}
