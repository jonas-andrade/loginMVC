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
public class Address {
    private int idAddress;
    private String street;
    private String city;
    private String country;
    private String nacionality;

    public Address() {
    }

    public Address(int idAddress, String street, String city, String country, String nacionality) {
        this.idAddress = idAddress;
        this.street = street;
        this.city = city;
        this.country = country;
        this.nacionality = nacionality;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    
    
    
    
    
}
