package dao;

import java.util.List;

import model.FaculityAccount;

public interface FaculityAccountDao {
	 void addFaculityAccount(FaculityAccount account);
	    void updateFaculityAccount(FaculityAccount account);
	    void deleteFaculityAccount(int accountId);
	    FaculityAccount getFaculityAccountById(int accountId);
	    List<FaculityAccount> getAllFaculityAccounts();
}
