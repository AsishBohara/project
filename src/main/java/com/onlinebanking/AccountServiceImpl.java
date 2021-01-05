package com.onlinebanking;

import java.util.List;

public class AccountServiceImpl implements AccountService {

	AccountDao accountDao = new AccountDaoImpl();

	@Override
	public int saveAccountInfo(Account account) {
		return accountDao.saveAccountInfo(account);
	}

	@Override
	public int updateAccountInfo(Account account) {
		return accountDao.updateAccountInfo(account);
	}

	@Override
	public int deleteAccountInfo(int id) {
		return accountDao.deleteAccountInfo(id);
	}

	@Override
	public List<Account> getAllAccountInfo() {
		return accountDao.getAllAccountInfo();
	}

	@Override
	public Account getAccountByID(int id) {
		return accountDao.getAccountByID(id);
	}
}