package com.customer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.demo.model.Customer;
import com.customer.demo.repository.CustomerRepository;

@RequestMapping("/save_customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
     @PostMapping
	 public Customer save(@RequestBody Customer customer) {
		
		Customer savedCust = customerRepository.save(customer);
 		System.out.println(savedCust);
		return  savedCust;

	}

}
