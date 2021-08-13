package com.customerServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customerServices.model.Customer;

@Repository
public interface UserRepository extends JpaRepository<Customer, Long> {

	Customer findByCustomerID(Long customerID);
	

}
