package com.java.infinite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class CustomerDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public List<Customer> showCustomer() throws 
	ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from customerdetails";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Customer> customerList = new ArrayList<Customer>();
		Customer customer = null;
		while(rs.next()) {
			customer=new Customer();
			customer.setCustomerId(rs.getString("customerId"));
			customer.setCustomername(rs.getString("customername"));
			customer.setCustomerdesignation(rs.getString("customerdesignation"));
			customer.setCustomeremail(rs.getString("customeremail"));
			customer.setCustomeraddress(rs.getString("customeraddress"));
			customerList.add(customer);

			}
return customerList;
	}
	
	public String addCustomer(Customer customer) 
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into customerdetails(CustomerId,CustomerName,CustomerDesignation,CustomerEmail,CustomerAddress,CustomerContact) "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1,customer.getCustomerId());
		pst.setString(2, customer.getCustomername());
		pst.setString(3, customer.getCustomerdesignation());
		pst.setString(4, customer.getCustomeremail());
		pst.setString(5, customer.getCustomeraddress());
		pst.setString(6, customer.getCustomercontact());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	
	public Customer searchCustomer(String id)
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from customerdetails where customerId=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, id);
		ResultSet rs = pst.executeQuery();
		Customer customer = null;
		if(rs.next()) {
			customer = new Customer();
			customer.setCustomerId(rs.getString("customerId"));
			customer.setCustomername(rs.getString("customername"));
			customer.setCustomerdesignation(rs.getString("customerdesignation"));
			customer.setCustomeremail(rs.getString("customeremail"));
			customer.setCustomeraddress(rs.getString("customeraddress"));
			customer.setCustomercontact(rs.getString("customercontact"));
		}
		return customer;
	}
	
	public String updateCustomer(Customer customerNew) 
			throws ClassNotFoundException, SQLException {
		Customer customer = searchCustomer(customerNew.getCustomerId());
		if (customer!=null) {
			String cmd = "update customerdetails set CustomerName=?,CustomerDesignation =?, CustomerEmail=?, CustomerAddress=?, "
					+ " CustomerContact =? where customerId=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, customerNew.getCustomername());
			pst.setString(2, customerNew.getCustomerdesignation());
			pst.setString(3, customerNew.getCustomeremail());
			pst.setString(4, customerNew.getCustomeraddress());
			pst.setString(5, customerNew.getCustomercontact());
			pst.setString(6,customerNew.getCustomerId());
			pst.executeUpdate();
			return "Customer Record Updated...";
		}
		return "Customer Not Found...";
	} 
	
	
	public String deleteCustomer(String id)
			throws ClassNotFoundException, SQLException {
		Customer customer = searchCustomer(id);
		if (customer!=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "delete from customerdetails where customerId=?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, id);
			pst.executeUpdate();
			return "Record Deleted...";
		}
		return "Customer Record Not Found...";
	}
		
	}
	

