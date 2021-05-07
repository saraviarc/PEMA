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
public class Vendedor extends Usuario{
    //Atributos
    private String tipoVendedor;
    //Método constructor por defecto
    public Vendedor(){
        
    }
    //Métodos Get y Set
    public String getTipoVendedor() {
        return tipoVendedor;
    }

    public void setTipoVendedor(String tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }
    
}
