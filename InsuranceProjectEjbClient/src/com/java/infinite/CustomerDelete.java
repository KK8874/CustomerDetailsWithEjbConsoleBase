package com.java.infinite;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CustomerDelete {
	
	  public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter CustomerId");
	        String id=sc.next();
	        CustomerBeanRemote service = null;



	           // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");



	           // service = (HelloService)new
	            // InitialContext().lookup("java:comp/env/ejb/HelloService");
	            service = (CustomerBeanRemote)
	                    new InitialContext().lookup("InsuranceProjectEJBEAR/CustomerBean/remote");
	         String customer=  service.deleteCustomer(id);
	         if(customer!=null)
	         {
	             System.out.println("Customer record deleted");
	         }
	}

}
