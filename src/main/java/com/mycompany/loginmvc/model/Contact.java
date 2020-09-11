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
public class Contact {
    private int idContact;
    private String email;
    private String telephone;
    private Register register = new Register();

    public Contact() {
    }

    public Contact(int idContact, String email, String telephone) {
        this.idContact = idContact;
        this.email = email;
        this.telephone = telephone;
    }

   



    public int getIdContact() {
        return idContact;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
    
}
