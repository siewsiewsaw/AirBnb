package com.example.demo.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PaymentRowMapper implements RowMapper<Payment> {
    @Override
    public Payment mapRow(ResultSet row, int rowNum) throws SQLException {
        Payment x = new Payment();
        // for each column in the DB, set 1 property on the java object
        // use getInt / getString / getBoolean depending on the column type in the DB
        x.setId(row.getInt("id"));
        x.setStatus(row.getString("status"));
        x.setAmount(row.getInt("amount"));
        x.setCreated_at(row.getDate("created_at"));
        x.setUpdated_at(row.getDate("updated_at"));
        x.setBooking_id(row.getInt("Booking_id"));

        return x;
    }
}