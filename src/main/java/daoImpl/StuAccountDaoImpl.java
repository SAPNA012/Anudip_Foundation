package daoImpl;

import dao.StuAccountDao;
import model.StuAccount;
import utility.hiberUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class StuAccountDaoImpl implements StuAccountDao {

    @Override
    public void addStuAccount(StuAccount account) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = hiberUtility.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(account);  // Save the account
            transaction.commit();  // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();  // Rollback on error
            }
            e.printStackTrace();  // Print the error
        } finally {
            if (session != null) {
                session.close();  // Close the session
            }
        }
    }

    @Override
    public void updateStuAccount(StuAccount account) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = hiberUtility.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(account);  // Update the account
            transaction.commit();  // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();  // Rollback on error
            }
            e.printStackTrace();  // Print the error
        } finally {
            if (session != null) {
                session.close();  // Close the session
            }
        }
    }

    @Override
    public void deleteStuAccount(int accountId) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = hiberUtility.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            StuAccount account = session.get(StuAccount.class, accountId);
            if (account != null) {
                session.delete(account);  // Delete the account if it exists
            }
            transaction.commit();  // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();  // Rollback on error
            }
            e.printStackTrace();  // Print the error
        } finally {
            if (session != null) {
                session.close();  // Close the session
            }
        }
    }

    @Override
    public StuAccount getStuAccountById(int accountId) {
        Session session = null;
        try {
            session = hiberUtility.getSessionFactory().openSession();
            return session.get(StuAccount.class, accountId);  // Get account by ID
        } catch (Exception e) {
            e.printStackTrace();  // Print the error
            return null;  // Return null if an error occurs
        } finally {
            if (session != null) {
                session.close();  // Close the session
            }
        }
    }

    @Override
    public List<StuAccount> getAllStuAccounts() {
        Session session = null;
        try {
            session = hiberUtility.getSessionFactory().openSession();
            return session.createQuery("FROM StuAccount", StuAccount.class).list();  // Get all accounts
        } catch (Exception e) {
            e.printStackTrace();  // Print the error
            return null;  // Return null if an error occurs
        } finally {
            if (session != null) {
                session.close();  // Close the session
            }
        }
    }

    @Override
    public void createStuAccount(StuAccount stuAccount) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = hiberUtility.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(stuAccount);  // Save the student account
            transaction.commit();  // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();  // Rollback on error
            }
            e.printStackTrace();  // Print the error
        } finally {
            if (session != null) {
                session.close();  // Close the session
            }
        }
    }
}
