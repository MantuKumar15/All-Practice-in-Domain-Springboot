package com.to1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.to1.model.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
