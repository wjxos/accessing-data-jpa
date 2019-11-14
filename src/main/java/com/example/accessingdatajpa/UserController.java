package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangJX
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description TODO
 * @createTime 2019年11月14日 15:14:00
 */

@RestController
public class UserController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/get")
    public Iterable<Customer> get(){
        Customer customer = new Customer("first", "last");
        return customerRepository.findByLastName(customer.getLastName());
    }

    @GetMapping("/getAll")
    public Iterable<Customer> getAll(){
        return customerRepository.findAll();
    }

}
