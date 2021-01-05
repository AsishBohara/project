package com.onlinebanking;

import java.util.List;

public interface AccountService {

	int saveAccountInfo(Account account);

	int updateAccountInfo(Account account);

	int deleteAccountInfo(int id);

	List<Account> getAllAccountInfo();

	Account getAccountByID(int id);

}
