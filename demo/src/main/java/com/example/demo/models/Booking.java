package com.example.demo.models;

import java.sql.Date;

public class Booking {
    public int id;
    public int propertyID;
    public int price;
    public Date bookingAT;
    public int userID;
    public Date checkInAt;
    public Date checkOutAt;
    public Date createdAt;
    public Date updatedAt;
    
  
    public Booking(){}

    public Booking(int id, int propertyID, int price, Date bookingAT, int userID,
    Date checkInAt,Date checkOutAt, Date createdAt, Date updatedAt){
        this.id = id;
        this.propertyID = propertyID;
        this.price = price;
        this.bookingAT = bookingAT;
        this.userID = userID;
        this.checkInAt = checkInAt;
        this.checkOutAt = checkOutAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return this.id;
    }

    public int getPropertyID() {
        return this.propertyID;
    }

    public int getPrice() {
        return this.price; 
    }

    public Date getBookingAT() {
        return this.bookingAT;
    }

    public int getUserID() {
        return this.userID;
    }

    public Date getCheckInAt() {
        return this.checkInAt;
    }

    public Date getCheckOutDate() {
        return this.checkOutAt;
    }
       
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
}
