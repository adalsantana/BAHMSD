package com.bah.msd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bah.msd.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	public CustomerServiceImpl() {
		Customer customer1 = new Customer(1L,"Lynton","pass", "jl@email.com");
		customerList.add(customer1);	
	}
	
	public List<Customer> getAllCustomers(){
		return customerList;
	}
	
}
