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
public class NuevoInicioSesion {

    public String inicioUsuarioSesion="";
    private String codigoUsuario;
    private String contraseña;
    
    //Método constructor
    public NuevoInicioSesion(String codigoUsuario, String contraseña) {
        this.codigoUsuario = codigoUsuario;
        this.contraseña = contraseña;
        this.inicioUsuarioSesion = codigoUsuario;
    }

    public NuevoInicioSesion() {
        
    }

//    public String getInicioUsuarioSesion() {
//        return inicioUsuarioSesion;
//    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
}
