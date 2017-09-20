/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.DriverManager;

/**
 *
 * @author Crismary
 */
public class conexion {
    
    public static final String bd = "animalitos3";
    public static final String login = "root";
    public static final String password = "";
    public static final String url = "jdbc:mysql://localhost/"+bd;
    
    public static com.mysql.jdbc.Connection getConection(){


    com.mysql.jdbc.Connection con = null;
    try {
        Class.forName("org.gjt.mm.mysql.Driver");
        con =  (com.mysql.jdbc.Connection) DriverManager.getConnection(url, login, password);
        //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        
    }catch(Exception e){
        System.out.println(e);
        }    
    
    return con;
} 
    
    
    }
