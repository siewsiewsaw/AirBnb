package com.example.demo.models;

import java.sql.Date;

public class Property {
    public int id;
    public String address;
    public String ownerID;
    public Date createdAt;
    public Date updatedAt;

    public Property(){}

    public Property(int id, String address, String ownerID, Date createdAt, Date updatedAt){
        this.id = id;
        this.address = address;
        this.ownerID = ownerID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return this.id;
    }

    public String getAddress() {
        return this.address;
    }

    public String getownerID() {
        return this.ownerID;
    }
    
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
}