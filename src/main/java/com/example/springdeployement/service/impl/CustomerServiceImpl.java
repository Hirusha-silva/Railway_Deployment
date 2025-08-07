package com.example.springdeployement.service.impl;

import com.example.springdeployement.entity.Customer;
import com.example.springdeployement.repo.CustomerRepo;
import com.example.springdeployement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    @Override
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRepo.findById(id).get();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer customerById =  customerRepo.findById(customer.getId()).get();
        customerById.setName(customer.getName());
        customerById.setAge(customer.getAge());
        customerRepo.save(customerById);
        return customerById;
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepo.deleteById(customer.getId());
    }

}
