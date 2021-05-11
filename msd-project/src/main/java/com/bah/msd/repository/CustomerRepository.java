package com.bah.msd.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.msd.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
