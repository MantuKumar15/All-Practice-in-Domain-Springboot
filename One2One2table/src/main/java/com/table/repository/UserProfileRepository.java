package com.table.repository;

import com.table.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface UserProfileRepository extends JpaRepository<Details, Integer> {

}