package com.bah.msd.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.domain.Customer;
import com.bah.msd.service.CustomerService;

@RestController
public class CustomerApi {

	@Autowired
	CustomerService customerService;
	
	
	@RequestMapping("/customer")
	public ArrayList<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
}
