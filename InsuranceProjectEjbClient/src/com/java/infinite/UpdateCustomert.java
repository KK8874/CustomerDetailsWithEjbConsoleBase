package com.java.infinite;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class UpdateCustomert {
	
	 public static void main(String[] args)  throws NamingException, ClassNotFoundException, SQLException{
	        Scanner sc = new Scanner(System.in);
	        Customer customer = new Customer();
	        System.out.println("Enter Customer id");
	        customer.setCustomerId(sc.next());
	        System.out.println("Enter  Customer Name  ");
	        customer.setCustomername(sc.next());
	        System.out.println("Enter Customer Designation  ");
	       customer.setCustomerdesignation(sc.next());
	        System.out.println("Enter Customer Email ");
	        customer.setCustomeremail(sc.next());
	        System.out.println("Enter Customer Address ");
	        customer.setCustomeraddress(sc.next());
	        System.out.println("Enter Customer Conatact");
	        customer.setCustomercontact(sc.next());
	        CustomerBeanRemote service = null;
	            service = (CustomerBeanRemote)
	                    new InitialContext().lookup("InsuranceProjectEJBEAR/CustomerBean/remote");
	            System.out.println(service.updateCustomer(customer));
	    }

}
