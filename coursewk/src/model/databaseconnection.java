/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class databaseconnection {
    static Connection con;
    public static Connection getMyConnection()
    {
        try
        {
        String dbpath = "jdbc:mysql://localhost/library";
        con = DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        
        }
        
        return con;
                
    }
    
}
