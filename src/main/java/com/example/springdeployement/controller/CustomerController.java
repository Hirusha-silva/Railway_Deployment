package com.example.springdeployement.controller;

import com.example.springdeployement.entity.Customer;
import com.example.springdeployement.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    public CustomerServiceImpl customerServiceImpl;

    @GetMapping
    public List<Customer> findAll() {
        return customerServiceImpl.fin
    }
}
