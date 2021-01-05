package com.transactionbanking;

import java.util.List;

public interface TransactionDao {
	
	int saveTransactionInfo(Transaction transaction);
	int updateTransactionInfo(Transaction transaction);
	int deleteTransactionInfo(int id);
	List<Transaction> getAllTransactionInfo();
	Transaction getTransactionByID(int id);

}
