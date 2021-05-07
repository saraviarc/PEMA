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
public class Administrador {
    //Atributos
    private String nombre="Administrador";
    private String contraseña="admin";
    private String cargo="Administrador";
    private String estado="Habilitado";
    private String codigoUsuario="admin";
    
    //Método constructor por defecto
    public Administrador(){
    };
    
    //Métodos
    /*Método registrarEmpleado deberá almacenar todos los datos necesarios para 
    crear un nuevo usuario en el sistema que serán la credenciales para un nuevo 
    empleado*/
    /*Puede haber Supervisor, Bodeguero o Vendedor*/
    public void registrarEmpleado(String nombre, String contraseña, String cargo, String estado, String codigoUsuario){
        //Para crear la clase adecuada se debe identificar que cargo tendrá el usuario
        if("Supervisor".equals(cargo)){
            Supervisor supervisor = new Supervisor();
            supervisor.setNombre(nombre);
            supervisor.setContraseña(contraseña);
            supervisor.setCargo(cargo);
            supervisor.setEstado(estado);
            supervisor.setCodigoUsuario(codigoUsuario);
        }
        else{
            if("Bodeguero".equals(cargo)){
                Bodeguero bodeguero = new Bodeguero();
                bodeguero.setNombre(nombre);
                bodeguero.setContraseña(contraseña);
                bodeguero.setCargo(cargo);
                bodeguero.setEstado(estado);
                bodeguero.setCodigoUsuario(codigoUsuario);
            }
            else{
                //Si no es Supervisor ni Bodeguero, debe ser Vendedor
                //Para Vendedor debe especificarse que tipo de vendedor es
                Vendedor vendedor = new Vendedor();
                vendedor.setNombre(nombre);
                vendedor.setContraseña(contraseña);
                vendedor.setCargo(cargo);
                vendedor.setEstado(estado);
                vendedor.setCodigoUsuario(codigoUsuario);
            }
        }
    }
    
    public void eliminarEmpleado(){
    }
    
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
