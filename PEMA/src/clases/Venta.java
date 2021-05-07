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
public class Venta {
    //Atributos
    private int idVenta;
    private String nombreCliente;
    private int codigoProducto;
    private float cantidadVenta;
    private float costoVenta;
    private int idUsuario;
    //Método constructor por defecto
    public Venta(){
    }
    //Métodos Get y Set
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public float getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(float cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public float getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(float costoVenta) {
        this.costoVenta = costoVenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
