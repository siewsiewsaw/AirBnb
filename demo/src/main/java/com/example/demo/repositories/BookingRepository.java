package com.example.demo.repositories;

import java.util.Date;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Booking;
//import com.example.demo.entities.BookingRowMapper;

@Transactional
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Query("SELECT b FROM Booking b WHERE b.bookingDate >= :bookingDate")
    public List<Booking> searchByBookingIdContains(@Param("bookingDate") Date bookingDate);
    // private final JdbcTemplate jdbcTemplate;
    // @Autowired
    // public BookingRepository(JdbcTemplate jdbcTemplate) {
	//   this.jdbcTemplate = jdbcTemplate;
    // }

    // public List<Booking> getAll() {
    //     String sql = "SELECT * FROM booking";
    //     RowMapper<Booking> rowMapper = new BookingRowMapper();
    //     return this.jdbcTemplate.query(sql, rowMapper);
    // } 
  
}