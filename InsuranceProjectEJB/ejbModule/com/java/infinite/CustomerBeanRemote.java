package com.java.infinite;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;



@Remote
public interface CustomerBeanRemote {
	
	List<Customer> showCustomer() throws ClassNotFoundException, SQLException;
	String addCustomer(Customer customer) throws ClassNotFoundException, SQLException;
	Customer searchCustomer(String id) throws ClassNotFoundException, SQLException;
	String deleteCustomer(String id) throws ClassNotFoundException, SQLException;;
	String updateCustomer(Customer customer) throws ClassNotFoundException, SQLException;;

}
