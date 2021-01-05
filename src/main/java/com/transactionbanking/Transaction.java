package com.transactionbanking;

public class Transaction {
	
	private int account_Id;
	private long balance;
	private long withdrawn_amount;
	private long deposit_amount;
	public int getAccount_Id() {
		return account_Id;
	}
	public void setAccount_Id(int account_Id) {
		this.account_Id = account_Id;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getWithdrawn_amount() {
		return withdrawn_amount;
	}
	public void setWithdrawn_amount(long withdrawn_amount) {
		this.withdrawn_amount = withdrawn_amount;
	}
	public long getDeposit_amount() {
		return deposit_amount;
	}
	public void setDeposit_amount(long deposit_amount) {
		this.deposit_amount = deposit_amount;
	}
	
	

}
