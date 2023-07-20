
package com.group1.supermarket.model;

public class Employee {
    private String firtsName;
    private String lastName;
    private String birthday;
    private int document;
    private int branche;
    private int role;

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }
    
    public int getBranche() {
        return branche;
    }

    public void setBranche(int branche) {
        this.branche = branche;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
