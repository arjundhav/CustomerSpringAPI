// It handles incoming HTTP requests to the API endpoints. 

package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerRequest;
import com.app.dto.CustomerResponse;
import com.app.model.Customer;
import com.app.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@PostMapping("/addcustomer")
	public ResponseEntity<CustomerResponse>addCustomer(@RequestBody CustomerRequest customer){
		return new ResponseEntity<CustomerResponse>(customerService.addCustomer(customer),HttpStatus.OK);
	}
	@PutMapping("/updatecustomer")
	public ResponseEntity<CustomerResponse> updateCustomer(@RequestBody CustomerRequest request){
		return new ResponseEntity<CustomerResponse>
		(customerService.updateCustomer(request),HttpStatus.OK);
			}
	@DeleteMapping("/remove")
	public ResponseEntity<String> deleteCustomer(@RequestParam int request){
		return new ResponseEntity<String>
		(customerService.deleteCustomer(request),HttpStatus.OK);
	}
	@GetMapping("/list")
	public ResponseEntity<List<Customer>>getAll(){
		return new ResponseEntity<List<Customer>>
		(customerService.getCustomer(),HttpStatus.OK);
	}
}
