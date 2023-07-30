package com.table.repository;

import com.table.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}