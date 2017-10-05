package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerRepository cust;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("using constructor injection");
		this.cust=customerRepository;
	}

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public void setCust(CustomerRepository cust) {
		System.out.println("Using setter injection");
		this.cust = cust;
	}

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		return cust.findAll();
	}

}
