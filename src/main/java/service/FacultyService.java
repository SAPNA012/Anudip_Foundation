package service;



import model.Faculity;
import java.util.List;

public interface FacultyService {
    void addFaculity(Faculity faculity);
    void updateFaculity(Faculity faculity);
    void deleteFaculity(int faculityId);
    Faculity getFaculityById(int faculityId);
    List<Faculity> getAllFaculities();
}
