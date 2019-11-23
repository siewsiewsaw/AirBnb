package com.example.demo.entities;

import java.util.Date;

public class Booking {
    private int id;
    private int price;
    private int user_id;
    private Date checkInAt;
    private Date checkOutAt;
    private Date bookingAt;
    private Date createdAt;
    private Date updatedAt;
    private String property_id;
   

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProperty_id() {
        return this.property_id;
    }

    public void setProperty_id(String property_id) {
        this.property_id = property_id;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getBookingAt() {
        return this.bookingAt;
    }

    public void setBookingAt(Date bookingAt) {
        this.bookingAt = bookingAt;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getCheckInAt() {
        return this.checkInAt;
    }

    public void setCheckInAt(Date checkInAt) {
        this.checkInAt = checkInAt;
    }

    public Date getCheckOutAt() {
        return this.checkOutAt;
    }

    public void setCheckOutAt(Date checkOutAt) {
        this.checkOutAt = checkOutAt;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}