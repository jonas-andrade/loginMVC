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
    private String passwordLogin;
    private String nivelDeAcesso;
    private Register register = new Register();

    public Login() {
    }

    public Login(int idLogin, String passwordLogin, String nivelDeAcesso) {
        this.idLogin = idLogin;
        this.passwordLogin = passwordLogin;
        this.nivelDeAcesso = nivelDeAcesso;
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

 

    
    
    
}
