package com.bah.msd.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bah.msd.domain.Customer;
import com.bah.msd.repository.CustomersRepository;

@RestController
@RequestMapping("/register")
public class RegisterAPI {
	@Autowired
	CustomersRepository repo;

	//  Workshop:  Implement logic to register a customer.  You could talk to the CustomersRepository object 
	//  directly; a more decoupled solution would be to use the customer API itself to manipulate Customer.
	//  Work out how to do this and build your own implementation,, look at RegisterAPISample.java 

	@PostMapping
	public ResponseEntity<?> registerCustomer(@RequestBody Customer newCustomer, UriComponentsBuilder uri) {
		//  Implementation here!
		return null;
	}


}