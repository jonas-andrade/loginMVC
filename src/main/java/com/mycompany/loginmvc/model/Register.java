/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loginmvc.model;

import java.util.Date;

/**
 *
 * @author jonas
 */
public class Register {
    private int idRegister;
    private String nameRegister;
    private char sexo;
    private Date dataNascimentoRegister;
    private String fraseRegister;
    private Address address = new Address();

    public Register() {
    }

    public Register(int idRegister, String nameRegister, char sexo, Date dataNascimentoRegister, String fraseRegister) {
        this.idRegister = idRegister;
        this.nameRegister = nameRegister;
        this.sexo = sexo;
        this.dataNascimentoRegister = dataNascimentoRegister;
        this.fraseRegister = fraseRegister;
    }

    public int getIdRegister() {
        return idRegister;
    }

    public String getNameRegister() {
        return nameRegister;
    }

    public char getSexo() {
        return sexo;
    }

    public Date getDataNascimentoRegister() {
        return dataNascimentoRegister;
    }

    public String getFraseRegister() {
        return fraseRegister;
    }

    public Address getAddress() {
        return address;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    public void setNameRegister(String nameRegister) {
        this.nameRegister = nameRegister;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDataNascimentoRegister(Date dataNascimentoRegister) {
        this.dataNascimentoRegister = dataNascimentoRegister;
    }

    public void setFraseRegister(String fraseRegister) {
        this.fraseRegister = fraseRegister;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
