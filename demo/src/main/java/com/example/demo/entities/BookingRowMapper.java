package com.example.demo.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class BookingRowMapper implements RowMapper<Booking> {
    @Override
    public Booking mapRow(ResultSet row, int rowNum) throws SQLException {

        Booking x = new Booking();
        // for each column in the DB, set 1 property on the java object
        // use getInt / getString / getBoolean depending on the column type in the DB
        x.setId(row.getInt("id"));
        x.setProperty_id(row.getString("Property_Id"));
        x.setPrice(row.getInt("Price"));
        x.setBookingAt(row.getDate("BookingAt"));
        x.setUser_id(row.getInt("User_id"));
        x.setCheckInAt(row.getDate("CheckInAt"));
        x.setCheckOutAt(row.getDate("CheckOutAt"));
        x.setCreatedAt(row.getDate("CreatedAt"));
        x.setUpdatedAt(row.getDate("UpdatedAt"));

        return x;
    }
}    