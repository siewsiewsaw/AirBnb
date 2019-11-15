package com.example.demo.models;

public class Payment {
    public int id;
    public String status;
    public int amount;
    public int bookingID;
    
    public Payment(){}

    public Payment(int id, String status, int amount, int bookingID) {
        this.id = id;
        this.status = status;
        this.amount = amount;
        this.bookingID = bookingID;
    }

    public int getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public int getAmount() {
        return this.amount; 
    }

    public int bookingID() {
        return this.bookingID;
    }
}

