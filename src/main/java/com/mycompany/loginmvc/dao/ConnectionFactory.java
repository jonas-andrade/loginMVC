/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loginmvc.dao;

import com.sun.source.tree.TryTree;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class ConnectionFactory {
    
    private Connection con= null;
    
public Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/donnaSalone", "jonas_admin", "admin");
            
            System.out.println("connection executado com sucess!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "\nerro ao tentar conectar"+ex);
        }
        return con;
}
    
    
}
