package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customersList = new ArrayList<>();
		
		Customer cust = new Customer();
		cust.setFirstname("Akshay");
		cust.setLastname("Salvi");
		
		customersList.add(cust);
		
		return customersList;
		
	}
}
