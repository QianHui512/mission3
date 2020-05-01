package com.qhui.mission3;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PetRowMapper implements RowMapper<Pet> {
    @Override
    public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
        Pet pet = new Pet();

        pet.setId(rs.getInt("ID"));
        pet.setType(rs.getString("Type"));
        pet.setPrice(rs.getString("Price"));

        return pet;
    }
}
