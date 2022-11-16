package com.java.infinite;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AddCustomerAllMain {
	
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("Enter CustomerId");
		customer.setCustomerId(sc.next());
		System.out.println("Enter Name  ");
		customer.setCustomername(sc.next());
		System.out.println("Enter CustomerDesignation  ");
		customer.setCustomerdesignation(sc.next());
		System.out.println("Enter CustomerEmail");
		customer.setCustomeremail(sc.next());
		System.out.println("Enter CustomerAddress  ");
		customer.setCustomeraddress(sc.next());
		System.out.println("Enter  CustomerContact  ");
		customer.setCustomercontact(sc.next());
		CustomerBeanRemote service = null;
		    service = (CustomerBeanRemote)
		    		new InitialContext().lookup("InsuranceProjectEJBEAR/CustomerBean/remote");
		    System.out.println(service.addCustomer(customer));
	}

}
