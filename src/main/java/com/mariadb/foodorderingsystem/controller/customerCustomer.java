package com.mariadb.foodorderingsystem.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.mariadb.foodorderingsystem.model.Customer;
import com.mariadb.foodorderingsystem.services.CustomerService;
import com.mariadb.foodorderingsystem.services.CustomerServiceImp;

@RestController
@RequestMapping(value="/customer")
public class customerCustomer {
@Autowired
CustomerService customerService;

@RequestMapping(value="/all",method=RequestMethod.GET)
public ResponseEntity<List<Customer>> getAllCustomer(){
	List<Customer>customerList=customerService.getCustomers();
	if(customerList==null || customerList.isEmpty()){
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	return new ResponseEntity<List<Customer>>(customerList,HttpStatus.OK);
}

@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
public Customer addCustomer(@RequestBody Customer customer){
	 	customerService.addCustomer(customer);
	 	return customer;
}

@RequestMapping(value="/findById",method=RequestMethod.GET)
public ResponseEntity<Customer>findById(@RequestParam int id){
	Customer customer=customerService.findById(id);
	if(customer==null){
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<Customer>(customer,HttpStatus.OK);
}
@RequestMapping(value="/findByFirstname",method=RequestMethod.GET)
public ResponseEntity<List<Customer>>findByFirstName(@RequestParam String firstName){
	List<Customer>customerList= customerService.findByFirstName(firstName);
	if(customerList==null||customerList.isEmpty()){
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<List<Customer>>(customerList,HttpStatus.OK);
}
}

