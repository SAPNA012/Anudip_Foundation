package service;

import model.Library;
import java.util.List;

public interface LibraryService {
    void addLibraryItem(Library libraryItem);
    void updateLibraryItem(Library libraryItem);
    void deleteLibraryItem(int libraryItemId);
    Library getLibraryItemById(int libraryItemId);
    List<Library> getAllLibraryItems();
}

