package com.customerServices.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customerServices.VO.ResponseTemplateVO;
import com.customerServices.model.Customer;
import com.customerServices.model.Department;
import com.customerServices.repositories.UserRepository;


import antlr.collections.List;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate resttemplate;
	
	
	public Customer registerACustomer(Customer departmentuser)
	{
		return userRepository.save(departmentuser);
	}
	
	public Optional<Customer> findCustomerById(Long id)
	{
		return userRepository.findById(id);
	}
	
	public java.util.List<Customer> findAllCustomer()
	{
		java.util.List<Customer> list = new ArrayList<>();
		userRepository.findAll().forEach(list::add);
		return list;
	}
	
	public ResponseTemplateVO getEmployeeswithDepratment(Long customerID)
	{
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Customer customer = userRepository.findByCustomerID(customerID);
		log.info("customer Id is :" + customer.getCustomerID());
		
		String url = "http://DEPARTMENTAL-SERVICE/departments/";
		 Department department =
				 resttemplate.getForObject(url + customer.getDepartmentId()
	                        ,Department.class);

		log.info("Details:" ,resttemplate);		
		vo.setCustomer(customer);
				vo.setDepartment(department);
				return vo;
	}
	 
}
