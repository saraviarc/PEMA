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
public class Bodeguero extends Usuario {
    //Método constructor por defecto
    public Bodeguero(){
    }
    //Métodos
    /*Método crearProducto recoge los datos de un nuevo producto
    que puede ser Verdura, Carne o Pan*/
    public void crearProducto(int cp,String n,String tp,String um ){
        if ("Verdura".equals(tp)){
        Verdura verdura=new Verdura();
        verdura.setCodigoProducto(cp);
        verdura.setNombre(n);
        verdura.setTipo(tp);
        verdura.setUm(um);
        }
        else{
            if("Carne".equals(tp)){
                Carne carne=new Carne();
                carne.setCodigoProducto(cp);
                carne.setNombre(n);
                carne.setTipo(tp);
                carne.setUm(um);
            }
            else{
                //Si no es Verdura ni Carne, debe ser Pan
                Pan pan=new Pan();
                pan.setCodigoProducto(cp);
                pan.setNombre(n);
                pan.setTipo(tp);
                pan.setUm(um);
            }
        }
    }
    
    /*Método ingresarProducto agrega los productos recibidos a una tabla, 
    dando el ingreso al inventario*/
    /*El cp(codigo de producto) debe ser validado que exista en la BD*/
    public void ingresarProducto(int cp,float c,float cu,float ct,String p,String ub){
        ProductoIngresado ingresarProd= new ProductoIngresado();
        ingresarProd.setCodigoProducto(cp);
        ingresarProd.setCantidad(c);
        ingresarProd.setCostounit(cu);
        ingresarProd.setCostTotal(ct);
        ingresarProd.setProveedor(p);
        ingresarProd.setUbicacion(ub);
    }
}
