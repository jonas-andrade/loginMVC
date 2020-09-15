/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loginmvc.model;

/**
 *
 * @author jonas
 */
public class Login {
    private int idLogin;
    private String userLogin;
    private String passwordLogin;
    private String nivelDeAcesso;
    private Register register = new Register();

  

    public Login(String userLogin, String passwordLogin) {
        
        this.userLogin = userLogin;
        this.passwordLogin = passwordLogin;
    }
    
    public Login() {
               

    }

    public Login(Object object, String user, String pass, Object object0) {
         
    }

    public int getIdLogin() {
        return idLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public Register getRegister() {
        return register;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

  public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
  
   
    
    
    
}
