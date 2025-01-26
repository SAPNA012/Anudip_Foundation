package dao;

import java.util.List;

import model.StuAccount;

public interface StuAccountDao {
	 void addStuAccount(StuAccount account);
	    void updateStuAccount(StuAccount account);
	    void deleteStuAccount(int accountId);
	    StuAccount getStuAccountById(int accountId);
	    List<StuAccount> getAllStuAccounts();
		void createStuAccount(StuAccount stuAccount);
}
