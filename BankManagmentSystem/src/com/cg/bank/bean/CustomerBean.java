package com.cg.bank.bean;

public class CustomerBean {
	 private int custumerId;
	 private String customerName;
	 private String phoneNo;
	 private String password;
	
	
	 
	public int getCustumerId() {
		return custumerId;
	}
	public void setCustumerId(int custumerId) {
		this.custumerId = custumerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	/*public CustomerBean(String customerName, String phoneNo, String password) {
		super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.password = password;
	}*/
	public CustomerBean() {
		
	}
	
	
	 
	 
	
	

}
