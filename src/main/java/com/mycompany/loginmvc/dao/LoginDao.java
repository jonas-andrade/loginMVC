/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loginmvc.dao;

import com.mycompany.loginmvc.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jonas
 */
public class LoginDao {
    private final Connection con;

    public LoginDao() {
        this.con = new ConnectionFactory().getConnection();
    }

   
    
    
    public void insert(Login login) throws SQLException{
        String sql = "insert into admin (login,pass) values (?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1,login.getUserLogin());
            stmt.setString(2,login.getPasswordLogin());
            stmt.execute();
            stmt.close();
      
        }
        
        
        
    }

}
