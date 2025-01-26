package serviceImpl;

import dao.LibraryDao;
import daoImpl.LibraryDaoImpl;
import model.Library;
import service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    private final LibraryDao libraryDao = new LibraryDaoImpl();

    @Override
    public void addLibraryItem(Library libraryItem) {
        libraryDao.addLibraryItem(libraryItem);
    }

    @Override
    public void updateLibraryItem(Library libraryItem) {
        libraryDao.updateLibraryItem(libraryItem);
    }

    @Override
    public void deleteLibraryItem(int libraryItemId) {
        libraryDao.deleteLibraryItem(libraryItemId);
    }

    @Override
    public Library getLibraryItemById(int libraryItemId) {
        return libraryDao.getLibraryItemById(libraryItemId);
    }

    @Override
    public List<Library> getAllLibraryItems() {
        return libraryDao.getAllLibraryItems();
    }
}
