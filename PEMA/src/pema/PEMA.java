/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pema;

import javax.swing.JOptionPane;
import clases.*;
import formularios.*;
import java.sql.Connection;

/**
 *
 * @author Roberto Mendoza
 */
public class PEMA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws ClassNotFoundException {
        //Abrir ventana de login
        Login login=new Login();
        login.setVisible(true);

        
        //Conexion a la base de datos
//        Conexion conexion = new Conexion();
//        conexion.getConexion();
        
        //Abrir ventana menu principarl
//        MenuPrincipal menu = new MenuPrincipal();
//        menu.setVisible(true);
        
    }
    
}
