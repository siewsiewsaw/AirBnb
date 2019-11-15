package com.example.demo.models;

import java.sql.Date;

public class Users {
    public int id;
    public String name;
    public String contactNo;
    public Date createdAt;
    public Date updatedAt;


    public Users(){}

    public Users(int id, String name, String contactNo, Date createdAt, Date updatedAt){
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getContactNo() {
        return this.contactNo;
    }
    
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
}
