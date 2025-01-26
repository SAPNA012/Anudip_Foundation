package serviceImpl;


import dao.FaculityAccountDao;
import daoImpl.FaculityAccountDaoImpl;
import model.FaculityAccount;
import service.FacultyAccountService;

import java.util.List;

public class FacultyAccountServiceImpl implements FacultyAccountService {
    private final FaculityAccountDao facultyAccountDao = new FaculityAccountDaoImpl();

    @Override
    public void addFacultyAccount(FaculityAccount facultyAccount) {
        facultyAccountDao.addFaculityAccount(facultyAccount);
    }

    @Override
    public void updateFacultyAccount(FaculityAccount facultyAccount) {
        facultyAccountDao.updateFaculityAccount(facultyAccount);
    }

    @Override
    public void deleteFacultyAccount(int accountId) {
        facultyAccountDao.deleteFaculityAccount(accountId);
    }

    @Override
    public FaculityAccount getFacultyAccountById(int accountId) {
        return facultyAccountDao.getFaculityAccountById(accountId);
    }

    @Override
    public List<FaculityAccount> getAllFacultyAccounts() {
        return facultyAccountDao.getAllFaculityAccounts();
    }
}
