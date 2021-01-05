package com.onlinebanking;

import java.util.List;

import javax.swing.JOptionPane;

public class AccountController {

	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		String choice = JOptionPane.showInputDialog("Enter choice: save|update|delete|list|get");

		switch (choice) {

		case "save":
			Account account = getAccount();
			int saved = accountService.saveAccountInfo(account);
			if (saved >= 1) {
				JOptionPane.showMessageDialog(null, "Account info is saved successfully in db");
			} else {
				JOptionPane.showMessageDialog(null, "Error in db");
			}
			break;

		case "update":
			Account updatedAccount = getAccount();
			System.out.println(updatedAccount);
			int updated = accountService.updateAccountInfo(updatedAccount);
			if (updated >= 1) {
				JOptionPane.showMessageDialog(null, "User info is updated successfully in db.");
			} else {
				JOptionPane.showMessageDialog(null, "Error in db");
			}
			break;

		case "delete":
			int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id"));
			int deleted = accountService.deleteAccountInfo(id);
			if (deleted >= 1) {
				JOptionPane.showMessageDialog(null,
						"User info is updated successfully in db. No of users deleted=" + deleted);
			} else {
				JOptionPane.showMessageDialog(null, "Error in db");
			}
			break;
		case "list":
			List<Account> accountList = accountService.getAllAccountInfo();
			for (Account a : accountList) {
				System.out.println(" id is: " + a.getId());
				System.out.println("Account name is: " + a.getAccount_name());
				System.out.println("Account number is: " + a.getAccount_no());
				System.out.println("Mobile no is: " + a.getMobile_no());
				System.out.println("Email is: " + a.getEmail());

				System.out.println("================");
			}
			break;

		case "get":
			id = Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
			Account a = accountService.getAccountByID(id);
			System.out.println("id is: " + a.getId());
			System.out.println("Account name is: " + a.getAccount_name());
			System.out.println("Account number is: " + a.getAccount_no());
			System.out.println("User Mobile no is: " + a.getMobile_no());
			System.out.println("Email is: " + a.getEmail());
			break;

		default:
			JOptionPane.showMessageDialog(null, "Wrong choice");
		}
	}

	public static Account getAccount() {
		Account account = new Account();
		String accountname = JOptionPane.showInputDialog("Enter accountname: ");
		Integer accountno = Integer.parseInt(JOptionPane.showInputDialog("Enter accountno:"));
		long moblieNo = Long.parseLong(JOptionPane.showInputDialog("Enter mobileno"));
		Integer id = Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
		String email = JOptionPane.showInputDialog("Enter email:");

		account.setAccount_name(accountname);
		account.setAccount_no(accountno);
		account.setMobile_no(moblieNo);
		account.setId(id);
		account.setEmail(email);

		return account;
	}

}
