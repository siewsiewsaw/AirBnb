// package com.example.demo.repositories;

// import java.util.List;

// import com.example.demo.entities.*;

// //import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
// // import org.springframework.jdbc.core.JdbcTemplate;
// // import org.springframework.jdbc.core.RowMapper;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// /**
//  * UserRepository
//  */

// @Transactional
// @Repository
// public interface UserRepository extends JpaRepository<User, Long>  {
//     @Query("SELECT u FROM Users u WHERE u.name = :name")
//     public List<User> searchByUserName(@Param("name") String name);
//     //private final JdbcTemplate jdbcTemplate;
//     // @Autowired
//     // public UserRepository(JdbcTemplate jdbcTemplate){
//     //     this.jdbcTemplate = jdbcTemplate;
//     // }

//     // public List<User> getAll() {
//     //     String sql = "SELECT * FROM user";
//     //     RowMapper<User> rowMapper = new UserRowMapper();
//     //     return this.jdbcTemplate.query(sql, rowMapper);
//     //   }

// }
