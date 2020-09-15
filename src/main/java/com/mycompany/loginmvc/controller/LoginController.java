/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loginmvc.controller;

import com.mycompany.loginmvc.dao.LoginDao;
import com.mycompany.loginmvc.dao.LoginHelper;
import com.mycompany.loginmvc.model.Login;
import com.mycompany.loginmvc.view.LoginView;




/**
 *
 * @author jonas
 */
public class LoginController {
    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }
    
   public void logar(){
       
       try {
           Login login = new LoginHelper().getModel();
           new LoginDao().insert(login);
           view.showMensage("conectado com sucesso!!");
       } catch (Exception e) {
        view.showMensage(e+"ocorreu um erro : ");
       }
       
       
      
       
   
   }
    
    
}
