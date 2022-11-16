package com.java.infinite;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CustomerSearchmain {
	
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		String id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CustomerId  ");
		id = sc.next();
		CustomerBeanRemote service = null;
		    service = (CustomerBeanRemote)
		    		new InitialContext().lookup("InsuranceProjectEJBEAR/CustomerBean/remote");
		Customer customer = service.searchCustomer(id);
		if (customer!=null) {
			System.out.println(customer);
		}

	}

}
