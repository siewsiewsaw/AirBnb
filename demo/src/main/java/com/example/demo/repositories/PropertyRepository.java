// package com.example.demo.repositories;

// import java.util.List;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.demo.entities.*;

// @Transactional
// @Repository
// public interface PropertyRepository extends JpaRepository<Property, Long>{
//     @Query("SELECT p FROM Property p WHERE p.id = :id")
//     public List<Property> searchByPropertyIdContains(@Param("propertId") Long id);
   
// }