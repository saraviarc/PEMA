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
public class ProductoPerecedero {
    //Atributos
    private String codigoProducto;
    private String nombre;
    private String um;
    private String tipo;//Verdura, Pan, Carne
    //Método constructor por defecto
    public ProductoPerecedero(){
    }

    public ProductoPerecedero(String codigoProducto, String nombre, String um, String tipo) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.um = um;
        this.tipo = tipo;
    }
    
    //Métodos Get y Set
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
