package serviceImpl;




import java.util.List;

import dao.StuAccountDao;
import daoImpl.StuAccountDaoImpl;
import model.StuAccount;
import service.StuAccountService;

public class StuAccountServiceImpl implements StuAccountService {
    private final StuAccountDao stuAccountDao = new StuAccountDaoImpl();

    @Override
    public void createStudentAccount(StuAccount stuAccount) {
        stuAccountDao.createStuAccount(stuAccount);
    }

    @Override
    public void updateStudentAccount(StuAccount stuAccount) {
        stuAccountDao.updateStuAccount(stuAccount);
    }

    @Override
    public void deleteStudentAccount(int accountId) {
        stuAccountDao.deleteStuAccount(accountId);
    }

    @Override
    public StuAccount getStudentAccountById(int accountId) {
        return stuAccountDao.getStuAccountById(accountId);
    }

    @Override
    public List<StuAccount> getAllStudentAccounts() {
        return stuAccountDao.getAllStuAccounts();
    }

	@Override
	public void addStuAccount(StuAccount account) {
		// TODO Auto-generated method stub
		 stuAccountDao.addStuAccount(account);
	}
}
