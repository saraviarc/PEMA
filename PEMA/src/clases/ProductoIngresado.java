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
public class ProductoIngresado {
    //Atributos
    //private int idIngreso;//Si no es necesario eliminar atributo y métodos
    private int codigoProducto;
    private float cantidad;
    private float costounit;
    private float costTotal;
    private String proveedor;
    private String ubicacion;
    //Método constructor por defecto
    public ProductoIngresado(){
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getCostounit() {
        return costounit;
    }

    public void setCostounit(float costounit) {
        this.costounit = costounit;
    }

    public float getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(float costTotal) {
        this.costTotal = costTotal;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
