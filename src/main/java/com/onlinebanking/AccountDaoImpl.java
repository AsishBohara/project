package com.onlinebanking;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vastika.uis.util.DbUtil;

public class AccountDaoImpl implements AccountDao {

	public static final String SAVE_SQL = "insert into account_tbl(account_name,account_no, mobile_no, id, email)values(?, ?, ?, ?, ?) ";
	public static final String UPDATE_SQL = "update  account_tbl set id = ?, account_name =?,account_no = ?, mobile_no=?, email=? where id=? ";
	public static final String DELETE_SQL = "delete from account_tbl where id=?";
	public static final String LIST_SQL = "select * from  account_tbl";
	public static final String GET_BY_ID_SQL = "select * from  account_tbl where id =?";

	@Override
	public int saveAccountInfo(Account account) {
		int saved = 0;
		try (PreparedStatement ps = DatabaseUtil.getConnection().prepareStatement(SAVE_SQL);

		) {
			ps.setString(1, account.getAccount_name());
			ps.setInt(2, account.getAccount_no());
			ps.setLong(3, account.getMobile_no());
			ps.setInt(4, account.getId());
			ps.setString(5, account.getEmail());
			saved = ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

		return saved;

	}

	@Override
	public int updateAccountInfo(Account account) {
		int updated = 0;
		try (

				PreparedStatement ps = DatabaseUtil.getConnection().prepareStatement(UPDATE_SQL);) {
			ps.setInt(1, account.getId());
			ps.setString(2, account.getAccount_name());
			ps.setInt(3, account.getAccount_no());
			ps.setLong(4, account.getMobile_no());
			ps.setString(5, account.getEmail());
			ps.setInt(6, account.getId());
			updated = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

		return updated;

	}

	@Override
	public int deleteAccountInfo(int id) {
		int deleted = 0;
		try (

				PreparedStatement ps = DatabaseUtil.getConnection().prepareStatement(DELETE_SQL);) {

			ps.setInt(1, id);
			deleted = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

		return deleted;

	}

	@Override
	public List<Account> getAllAccountInfo() {
		List<Account> accountList = new ArrayList<>();
		try (

				PreparedStatement ps = DatabaseUtil.getConnection().prepareStatement(LIST_SQL);) {

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Account account = new Account();
				account.setId(rs.getInt("Id"));
				account.setAccount_name(rs.getString("Account_name"));
				account.setAccount_no(rs.getInt("Account_no"));
				account.setMobile_no(rs.getLong("mobile_no"));
				account.setEmail(rs.getString("email"));

				accountList.add(account);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

		return accountList;

	}

	@Override
	public Account getAccountByID(int id) {
		Account account = new Account();

		try (

				PreparedStatement ps = DatabaseUtil.getConnection().prepareStatement(GET_BY_ID_SQL);) {

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				account.setAccount_name(rs.getString("Account_name"));
				account.setAccount_no(rs.getInt("Account_no"));
				account.setMobile_no(rs.getLong("mobile_no"));
				account.setId(rs.getInt("id"));
				account.setEmail(rs.getString("email"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

		return account;
	}

}
