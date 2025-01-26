package dao;

import java.util.List;

import model.Faculity;

public interface FaculityDao {
	
	 void addFaculity(Faculity faculity);
	    void updateFaculity(Faculity faculity);
	    void deleteFaculity(int faculityId);
	    Faculity getFaculityById(int faculityId);
	    List<Faculity> getAllFaculities();

}

