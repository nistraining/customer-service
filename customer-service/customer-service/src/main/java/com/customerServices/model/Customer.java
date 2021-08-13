package com.customerServices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customer_id")
	private Long customerID;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="customer_email")
	private String customerEmail;
	@Column(name= "customer_mobile")
	private String customermobile;
	@Column(name="customer_address")
	private String customeraddress;
	@Column(name="customer_city")
	private String customerCity;
	
	private Long departmentId;
	
	

}
