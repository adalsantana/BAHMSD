package com.bah.msd.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.bah.msd.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public CustomerServiceImpl() {
		Customer customer1 = new Customer(1,"Lynton","pass", "jl@email.com");
		Customer customer2 = new Customer(2,"Adal","guess", "asc@email.com");
		Customer customer3 = new Customer(1,"Brandon","foo", "bw@email.com");
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
	}
	public ArrayList<Customer> getAllCustomers(){
		return customerList;
	}

}
