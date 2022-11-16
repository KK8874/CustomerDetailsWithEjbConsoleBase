package com.java.infinite;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CustomerShowAllMain {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		CustomerBeanRemote service = null;

		    // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");

		    // service = (HelloService)new
		    // InitialContext().lookup("java:comp/env/ejb/HelloService");
		    service = (CustomerBeanRemote)
		    		new InitialContext().lookup("InsuranceProjectEJBEAR/CustomerBean/remote");

		    List<Customer> customerList = service.showCustomer();
		    for (Customer customer : customerList) {
				System.out.println(customer);
			}
	}
}
