package com.mariadb.foodorderingsystem.services;

import java.util.List;

import com.mariadb.foodorderingsystem.model.Customer;

public interface CustomerService {
public Customer addCustomer(Customer customer);
public List<Customer> getCustomers();
public Customer findById(int id);
public List<Customer> findByFirstName(String firstName);
}
