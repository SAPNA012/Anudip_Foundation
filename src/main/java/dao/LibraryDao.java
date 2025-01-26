package dao;

import model.Library;
import java.util.List;

public interface LibraryDao {
    void addLibraryItem(Library libraryItem);
    void updateLibraryItem(Library libraryItem);
    void deleteLibraryItem(int libraryItemId);
    Library getLibraryItemById(int libraryItemId);
    List<Library> getAllLibraryItems();
}



