//It contains business logic to store,retrieve,delete and update.

package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.dto.CustomerRequest;
import com.app.dto.CustomerResponse;
import com.app.model.Customer;
import com.app.repository.customerRepository;

@Service
public class CustomerService {
@Autowired
customerRepository customerRepo;

public CustomerResponse addCustomer(CustomerRequest customer) {
	// TODO Auto-generated method stub
	Customer cust=customerRequest(customer);
	Customer response=customerRepo.save(cust);
	CustomerResponse customerResponse=new CustomerResponse();
	if(response!=null) {
		customerResponse.setCustomer(response);
		customerResponse.setStatus("SUCCESS");
	}else {
		customerResponse.setCustomer(cust);
		customerResponse.setStatus("Fail");
	}
	return customerResponse;
	
}
private Customer customerRequest(CustomerRequest customer) {
	Customer cust=new Customer();
	cust.setBalance(customer.getBalance());
	cust.setCustAddress(customer.getCustAddress());
	cust.setBalance(customer.getBalance());
	cust.setCustName(customer.getCustName());
	cust.setMobile(customer.getMobile());
	
	return cust;
}
public CustomerResponse updateCustomer(Customer request) {
	// TODO Auto-generated method stub
	Customer res=customerRepo.findById(request.getCustId()).get();
	CustomerResponse response=new CustomerResponse();
	if(res!=null) {
		Customer cust=new Customer();
		cust.setCustAddress(request.getCustAddress());
		Customer updatecust=customerRepo.save(cust);
		if(updatecust!=null) {
			response.setCustomer(updatecust);
			response.setStatus("Updated");
		}
	}
	else {
		response.setStatus("Please check your Record or connect with admin...!");
	}
	return response;
}
public CustomerResponse updateCustomer(CustomerRequest request) {
	// TODO Auto-generated method stub
	return null;
}
public String deleteCustomer(int request) {
	// TODO Auto-generated method stub
	String sts="FAIL";
	Customer c=customerRepo.getById(request);
	if(c!=null)
	{
		customerRepo.deleteById(request);
		sts="Deleted";
			}else {
				sts="Record not found...!";
			}
	return sts;
}
public java.util.List<Customer> getCustomer() {
	// TODO Auto-generated method stub
	return customerRepo.findAll();
}

}
