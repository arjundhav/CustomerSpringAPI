package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Customer;

@Repository
public interface customerRepository extends JpaRepository<Customer, Integer>{

	Customer findBycustName(String custName);

}

// Repository Class  is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.
// Before implementing the Repository class we have created a generic DemoRepository interface to provide the contact for our repository class to implement.
