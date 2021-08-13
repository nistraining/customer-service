package com.customerServices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customerServices.VO.ResponseTemplateVO;
import com.customerServices.model.Customer;
import com.customerServices.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/customers")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		return customerService.registerACustomer(customer);
		
	}
	
//	@RequestMapping(method = RequestMethod.GET,value = "/customers/{id}")
//	public Optional<Customer> findCustomerById(@PathVariable Long id)
//	{
//		return customerService.findCustomerById(id);
//	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/customers")
	public List<Customer> findAllCustomer()
	{
		return customerService.findAllCustomer();
	}
	
	@RequestMapping("/customers/{customerID}")
	public ResponseTemplateVO getCustomerWithDepartment(@PathVariable Long customerID)
	{
		return customerService.getEmployeeswithDepratment(customerID);
	}

}
