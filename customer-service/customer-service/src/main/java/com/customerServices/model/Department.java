package com.customerServices.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	
	
	private Long departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentemail;
	private String departmentAddress;

}
