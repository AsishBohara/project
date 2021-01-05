package com.transactionbanking;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransactionDaoImpl implements TransactionDao {

		
		public static final String SAVE_SQL = "insert into transaction_tbl (account_id, balance, withdrawn_amount, deposit_amount) values(?, ?, ?, ? )";
	    public static final String UPDATE_SQL =" update transaction_tbl set account_id=?, balance=?, withdrawn_amount=?, deposit_amount=? where account_id=?";
	    public static final String DELETE_SQL ="delete from transaction_tbl where account_id=?";
	    public static final String LIST_SQL = "selecr * from transaction_tbl";
	    public static final String GET_BY_ID_SQL ="select * from transaction_tbl where account_id=?";
		@Override
		public int saveTransactionInfo(Transaction transaction) {
			int saved = 0;
			try(PreparedStatement ps = DbsUtil.getConnection().prepareStatement(SAVE_SQL);
					
					){
				ps.setInt(1, transaction.getAccount_Id());
				ps.setLong(2, transaction.getBalance());
				ps.setLong(3, transaction.getWithdrawn_amount());
				ps.setLong(4, transaction.getDeposit_amount());
				
				 saved = ps.executeUpdate();
				
			} catch (ClassNotFoundException |SQLException e) {
				e.printStackTrace();
			} 
			
			
			return saved;
		}
		@Override
		public int updateTransactionInfo(Transaction transaction) {
		
			int updated = 0;
			try(PreparedStatement ps = DbsUtil.getConnection().prepareStatement(UPDATE_SQL);
					
					){
					ps.setInt(1, transaction.getAccount_Id());
					ps.setLong(2, transaction.getBalance());
					ps.setLong(3, transaction.getWithdrawn_amount());
					ps.setLong(4, transaction.getDeposit_amount());
					updated = ps.executeUpdate();
					
			
			
			} catch (ClassNotFoundException |SQLException  e) {
				e.printStackTrace();
			
			}
			
			
			return updated;
		}
		@Override
		public int deleteTransactionInfo(int id) {
			int deleted = 0;
			try(
					PreparedStatement ps = DbsUtil.getConnection().prepareStatement(DELETE_SQL);
					){
					ps.setInt(1, id);
					deleted = ps.executeUpdate();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return deleted;
		}
		@Override
		public List<Transaction> getAllTransactionInfo() {
			
			List<Transaction> transactionList = new ArrayList<>();
			try(
					PreparedStatement ps = DbsUtil.getConnection().prepareStatement(LIST_SQL);
					
					){
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Transaction transaction = new Transaction();
					transaction.setAccount_Id(rs.getInt("Account_Id"));
					transaction.setBalance(rs.getLong("Balance"));
					transaction.setWithdrawn_amount(rs.getLong("Withdrawn_amount"));	
					transaction.setDeposit_amount(rs.getLong("Deposit_amount"));
				  transactionList.add(transaction);
				}
			} catch (ClassNotFoundException |SQLException e) {
				e.printStackTrace();
			
				
			}
			
			return transactionList;
			
			
			
		}
		@Override
		public Transaction getTransactionByID(int id) {
			Transaction transaction = new Transaction();
			try(
				PreparedStatement ps =DbsUtil.getConnection().prepareStatement(GET_BY_ID_SQL);	
					){
			
			
			ps.setInt(1, id);
			ResultSet rs =ps.executeQuery();
			if(rs.next()) {
				transaction.setAccount_Id(rs.getInt("Account_id"));
			    transaction.setBalance(rs.getLong("Balance"));
			    transaction.setWithdrawn_amount(rs.getLong("Withdrawn_amount"));
			    transaction.
			
			}
			
			
			
			
			
			
			
			
			
			return null;
		}
	    
	
	

		}
