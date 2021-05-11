/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Mendoza
 */
public class Conexion {
    // Declaramos la conexion a mysql
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String DRIVER ="com.mysql.jdbc.Driver";
    private static final String USERNAME ="root";
    private static final String PASSWORD ="root";
    private static final String URL ="jdbc:mysql://localhost:3306/bd_pema";
    //Variable que almacena el estado de la conexion
    private String estadoConexion;
    
    // Funcion que va conectarse a mi bd de mysql
    public Conexion() {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(DRIVER);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
//                JOptionPane.showMessageDialog(null,"Conexion establecida");
                estadoConexion=("Conexion establecida ");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (Exception e){
//            JOptionPane.showMessageDialog(null,"Error de conexion" + e);
//            System.out.println("Error de conexion" + e);
            estadoConexion=("Error de conexion "+ e);
        }
    }
    
    public Connection getConexion() {
        return con;
    }

    public String getEstadoConexion() {
        return estadoConexion;
    }
    
}
