package com.onlinebanking;

import java.util.List;

import com.vastika.uis.model.User;

public interface AccountDao {

	int saveAccountInfo(Account account);

	int updateAccountInfo(Account account);

	int deleteAccountInfo(int id);

	List<Account> getAllAccountInfo();

	Account getAccountByID(int id);
}
