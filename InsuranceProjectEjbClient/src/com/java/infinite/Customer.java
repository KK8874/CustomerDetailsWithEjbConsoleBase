package com.java.infinite;

import java.io.Serializable;

public class Customer implements Serializable {
	
	private String customerId;
	private String customername;
	private String customerdesignation;
	private String customeremail;
	private String customeraddress;
	private String customercontact;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerdesignation() {
		return customerdesignation;
	}
	public void setCustomerdesignation(String customerdesignation) {
		this.customerdesignation = customerdesignation;
	}
	public String getCustomeremail() {
		return customeremail;
	}
	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public String getCustomercontact() {
		return customercontact;
	}
	public void setCustomercontact(String customercontact) {
		this.customercontact = customercontact;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customername=" + customername + ", customerdesignation="
				+ customerdesignation + ", customeremail=" + customeremail + ", customeraddress=" + customeraddress
				+ ", customercontact=" + customercontact + "]";
	}
	
	
}