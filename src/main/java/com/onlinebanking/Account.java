package com.onlinebanking;

public class Account {
	
	private String account_name;
	private int account_no;
	private int id;
	private String email;
	private long mobile_no;
	
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	@Override
	public String toString() {
		return "Account [account_name=" + account_name + ", account_no=" + account_no + ", id=" + id + ", email="
				+ email + ", mobile_no=" + mobile_no + "]";
	}

	
}
