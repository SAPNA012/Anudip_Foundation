package daoImpl;

import dao.LibraryDao;
import model.Library;
import utility.hiberUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class LibraryDaoImpl implements LibraryDao {
    @Override
    public void addLibraryItem(Library libraryItem) {
        Transaction transaction = null;
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(libraryItem);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void updateLibraryItem(Library libraryItem) {
        Transaction transaction = null;
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(libraryItem);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void deleteLibraryItem(int libraryItemId) {
        Transaction transaction = null;
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Library libraryItem = session.get(Library.class, libraryItemId);
            if (libraryItem != null) {
                session.delete(libraryItem);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public Library getLibraryItemById(int libraryItemId) {
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            return session.get(Library.class, libraryItemId);
        }
    }

    @Override
    public List<Library> getAllLibraryItems() {
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            return session.createQuery("FROM Library", Library.class).list();
        }
    }
}

