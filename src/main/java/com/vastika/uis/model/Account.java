package com.vastika.uis.model;

public class Account {

	private String account_name;
	private int account_no;
	private int id;
	private String email;
	private long mobile_no;

	public static void main(String[] args) {
		
		Account ob = new Account();
		//String name = ob.getAccount_name();
       System.out.println("account name is: "+ ob.getAccount_name());
       
       
	}

	public Account() {
		super();
	}

	public Account(String account_name, int account_no, int id, String email, long mobile_no) {
		super();
		this.account_name = account_name;
		this.account_no = account_no;
		this.id = id;
		this.email = email;
		this.mobile_no = mobile_no;
	}

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

}
