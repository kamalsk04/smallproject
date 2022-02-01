package org.test;

import org.test1.Client;

public class Company {
	
	private void CompanyName() {
		System.out.println("12345");

	}
	
	private void CompanyAddress() {
		System.out.println("gandhiji Road , Emaneshwaram");

	}

	
	public static void main(String[] args) {
		
		EmployeeDetails e=new EmployeeDetails();
		e.EmployeeName();
		e.EmployeeId();
		e.EmployeeAddress();
		
		
		Company c=new Company();
		
		c.CompanyName();
		c.CompanyAddress();
		
		
		Client m=new Client();
		
		m.ClientName();
		m.ClientAddress();
		
		
		
	}
	
	
	
	
	
	
	
	

}
