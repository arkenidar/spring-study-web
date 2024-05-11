package com.arkenidar.springstudyweb.controllers;

import org.springframework.web.bind.annotation.*;

import com.arkenidar.springstudyweb.customer.*;

@RestController
@RequestMapping("/customer")
public class CustomerREST {

    private CustomerRepository customerRepository;

    public CustomerREST(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/")
    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/add_samples")
    public Iterable<Customer> customersAddSamples() {

        // save a few customers
        customerRepository.save(new Customer("Jack", "Bauer"));
        customerRepository.save(new Customer("Chloe", "O'Brian"));

        return getAllCustomers();
    }

}