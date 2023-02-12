package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Customer;

@Repository
public interface customerRepository extends JpaRepository<Customer, Integer>{

	Customer findBycustName(String custName);

}
