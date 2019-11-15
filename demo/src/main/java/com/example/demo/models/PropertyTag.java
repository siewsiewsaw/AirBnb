package com.example.demo.models;

public class PropertyTag {
    public int id;
    public String lable;
    
    public PropertyTag(){}

    public PropertyTag(int id, String lable) {
        this.id = id;
        this.lable = lable;
    }

    public int getId() {
        return this.id;
    }

    public String getLable() {
        return this.lable;
    }
  
}
