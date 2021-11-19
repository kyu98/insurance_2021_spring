package com.insurance.sce.dao;

import java.util.ArrayList;

import com.insurance.sce.model.customer.Customer;

public interface CustomerDAO {
	public boolean insert(Customer customer);
	
	public ArrayList<Customer> select();
	public Customer selectCustomer(String customerId);
	public Customer selectCustomerByIdPw(String id, String pw);
	
	public boolean updateAddress(String customerId, String address);
	public boolean updatePhoneNumber(String customerId, String phoneNumber);
	
	public boolean delete(String customerId);
}
