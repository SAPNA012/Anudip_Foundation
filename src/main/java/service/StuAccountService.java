package service;



import model.StuAccount;
import java.util.List;

public interface StuAccountService {
    void createStudentAccount(StuAccount stuAccount);
    void updateStudentAccount(StuAccount stuAccount);
    void deleteStudentAccount(int accountId);
      StuAccount getStudentAccountById(int accountId);
    List<StuAccount> getAllStudentAccounts();
	void addStuAccount(StuAccount account);
}
