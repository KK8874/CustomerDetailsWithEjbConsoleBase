package com.java.infinite;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;



/**
 * Session Bean implementation class CustomerBean
 */
@Stateless
@LocalBean
public class CustomerBean implements CustomerBeanRemote {
	
	static CustomerDAO dao;
	static {
		dao=new CustomerDAO();
	}

    /**
     * Default constructor. 
     */
    public CustomerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Customer> showCustomer() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.showCustomer();
	}
	
	@Override
	public String addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.addCustomer(customer);
	}

	
	 @Override
		public Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			return dao.searchCustomer(id);
		}
	 
	@Override
	public String updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer);
	}

	@Override
	public String deleteCustomer(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(id);
	}

	

	

	

	
	
	
	

}
