/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chetniks.domain;

/**
 *
 * @author user
 */
public class Company {
    public int PIB;
    public String name;
    public String phoneNumber;
    public String webSite;
    public String address;

    public Company(int PIB, String name, String phoneNumber, String webSite, String address) {
        this.PIB = PIB;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.webSite = webSite;
        this.address = address;
    }

    public int getPIB() {
        return PIB;
    }

    public void setPIB(int PIB) {
        this.PIB = PIB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
