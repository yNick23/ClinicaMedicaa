/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ConexaoDAO {
    
    public static Connection conectaDB() {
        Connection conex = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/Clinicaa?user=root&password=";
            conex = DriverManager.getConnection(url);
        
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conex;
}
}
