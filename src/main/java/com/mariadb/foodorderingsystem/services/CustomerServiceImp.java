package com.mariadb.foodorderingsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mariadb.foodorderingsystem.model.Customer;
@Service
public class CustomerServiceImp implements CustomerService {
	List<Customer> customerList=new ArrayList<>();
	List<Customer> searchCustomer=new ArrayList<>();
	@Override
	public Customer addCustomer(Customer customer) {
		customerList.add(customer);
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		return customerList;
	}

	@Override
	public Customer findById(int id) {
		Customer customer= new Customer();
		for(Customer c: customerList){
			if(c.getId()==id){
			customer=c;
			}
		}
		return customer;
	}

	@Override
	public List<Customer> findByFirstName(String firstName) {
		for(Customer c:customerList){
			if(c.getFirstName().equals(firstName)){
				searchCustomer.add(c);
			}
				
		}
		return searchCustomer;
	}

	
	
}
