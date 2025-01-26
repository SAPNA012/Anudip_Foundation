package service;


import model.FaculityAccount;
import java.util.List;

public interface FacultyAccountService {
    void addFacultyAccount(FaculityAccount facultyAccount);
    void updateFacultyAccount(FaculityAccount facultyAccount);
    void deleteFacultyAccount(int accountId);
    FaculityAccount getFacultyAccountById(int accountId);
    List<FaculityAccount> getAllFacultyAccounts();
}
