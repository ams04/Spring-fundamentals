package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository cust;
	
	public CustomerServiceImpl(){}
	
	public CustomerServiceImpl(CustomerRepository cust) {
		super();
		System.out.println("Constructorss injection");
		this.cust = cust;
	}

	@Autowired
	public void setCust(CustomerRepository cust) {
		System.out.println("Setter injection");
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
