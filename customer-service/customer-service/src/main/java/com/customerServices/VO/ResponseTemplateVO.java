package com.customerServices.VO;

import com.customerServices.model.Customer;
import com.customerServices.model.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private Customer customer;
	private Department department;

}
