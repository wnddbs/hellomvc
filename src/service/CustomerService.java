package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	
	private Map<String, Customer> customers;
	
	public static final CustomerService instance = new CustomerService();
	
	public CustomerService(){
		customers = new HashMap<String, Customer>();
		
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(),customer);
	}
	
	
	public Customer login(String id, String password){
		if(id!=null){
			Customer customer=instance.customers.get(id.toLowerCase());
			if(customer.getPassword().equals(password))
				return customer;
			else return null;
		}
		return null;
		
	}
}