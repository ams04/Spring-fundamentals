package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public CustomerServiceImpl(CustomerRepository cust) {
		super();
		System.out.println("Constrcutor injection");
		this.customerRepository = cust;
	}

	public void setCustomerRepository(CustomerRepository cust) {
		this.customerRepository = cust;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

}
