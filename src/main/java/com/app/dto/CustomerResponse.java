package com.app.dto;

import org.springframework.stereotype.Component;

import com.app.model.Customer;


@Component
public class CustomerResponse {
private Customer customer;
private String status;
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "CustomerResponse [status=" + status + "]";
}

}
