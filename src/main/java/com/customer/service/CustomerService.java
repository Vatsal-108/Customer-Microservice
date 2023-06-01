package com.customer.service;

import java.util.List;

import com.customer.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	
	public Customer getCustomerById(int customerId);
	
	public List<Customer> getAllCustomer();
}
