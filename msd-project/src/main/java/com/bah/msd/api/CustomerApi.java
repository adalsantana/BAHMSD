package com.bah.msd.api;


import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.bah.msd.domain.Customer;
import com.bah.msd.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerApi {

	@Autowired
	CustomerRepository repo;
	
	
	@GetMapping
	public Iterable<Customer> getAllCustomers(){
		return repo.findAll();
	}
	
	@GetMapping("/{customerId}")
	public Optional<Customer> getCustomerByID(@PathVariable("customerId") long id){
		return repo.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer newCustomer, UriComponentsBuilder uri){
		if (newCustomer.getId() != 0 || newCustomer.getName() == null || newCustomer.getEmail() == null) {
			// invalid customer fields
			return ResponseEntity.badRequest().build();
		}
		
		newCustomer = repo.save(newCustomer);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newCustomer.getId()).toUri();
		ResponseEntity<?> response = ResponseEntity.created(location).build();
		return response;
	}
	
	
 }
