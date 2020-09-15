/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loginmvc.dao;

import com.mycompany.loginmvc.model.Login;
import com.mycompany.loginmvc.view.LoginView;

/**
 *
 * @author jonas
 */
public class LoginHelper {

    private final LoginView view;

    public LoginHelper() {
        this.view = new LoginView();
    }

    public Login getModel(){
       String user =  view.getjTextFieldUser().getText();
       String senha = view.getjPasswordFieldPass().getText(); 
       return new Login(user, senha); 
       
    }
    
    public void setModel(Login login ){
    view.getjTextFieldUser().setText(login.getUserLogin());
    view .getjPasswordFieldPass().setText(login.getPasswordLogin());
        
    }
    
    public void clear(){
        view.getjTextFieldUser().setText("");
        view .getjPasswordFieldPass().setText("");
        
    }
    
    
    
}
