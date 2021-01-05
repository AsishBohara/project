package com.vastika.uis.model;

import java.sql.Date;

public class Transaction {
	public float balance;
	public float withdrawn_amount;
	public float deposit_amount;
	public int account_id;
	public Date deposit_date;
	
	public Transaction() {
		super();
	}
	
	public Transaction(float balance, float withdrawn_amount, float deposit_amount, int account_id, Date deposit_date) {
		super();
		this.balance = balance;
		this.withdrawn_amount = withdrawn_amount;
		this.deposit_amount = deposit_amount;
		this.account_id = account_id;
		this.deposit_date = deposit_date;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float getWithdrawn_amount() {
		return withdrawn_amount;
	}
	public void setWithdrawn_amount(float withdrawn_amount) {
		this.withdrawn_amount = withdrawn_amount;
	}
	public float getDeposit_amount() {
		return deposit_amount;
	}
	public void setDeposit_amount(float deposit_amount) {
		this.deposit_amount = deposit_amount;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public Date getDeposit_date() {
		return deposit_date;
	}
	public void setDeposit_date(Date deposit_date) {
		this.deposit_date = deposit_date;
	}
	
	
}
