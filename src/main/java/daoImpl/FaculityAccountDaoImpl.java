package daoImpl;
import dao.FaculityAccountDao;
import model.FaculityAccount;
import utility.hiberUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;


public class FaculityAccountDaoImpl implements FaculityAccountDao {
	
	 @Override
	    public void addFaculityAccount(FaculityAccount account) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.save(account);
	            transaction.commit();
	        }
	    }

	    @Override
	    public void updateFaculityAccount(FaculityAccount account) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.update(account);
	            transaction.commit();
	        }
	    }

	    @Override
	    public void deleteFaculityAccount(int accountId) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            FaculityAccount account = session.get(FaculityAccount.class, accountId);
	            if (account != null) {
	                session.delete(account);
	            }
	            transaction.commit();
	        }
	    }

	    @Override
	    public FaculityAccount getFaculityAccountById(int accountId) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            return session.get(FaculityAccount.class, accountId);
	        }
	    }

	    @Override
	    public List<FaculityAccount> getAllFaculityAccounts() {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            return session.createQuery("FROM FaculityAccount", FaculityAccount.class).list();
	        }
	    }
	}



