package com.example.demo.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PropertyRowMapper implements RowMapper<Property> {
    @Override
    public Property mapRow(ResultSet row, int rowNum) throws SQLException {
        Property x = new Property();
        x.setId(row.getInt("id"));
        x.setAddress(row.getString("address"));
        x.setCreated_at(row.getDate("create_at"));
        x.setUpdated_at(row.getDate("updated_at"));
        x.setOwner_id(row.getString("owner_id"));
        return x;
    }
}