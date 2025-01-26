package serviceImpl;


import java.util.List;

import dao.FaculityDao;
import daoImpl.FaculityDaoImpl;
import model.Faculity;
import service.FacultyService;

public class FacultyServiceImpl implements FacultyService {
    private final FaculityDao faculityDao = new FaculityDaoImpl();

    @Override
    public void addFaculity(Faculity faculity) {
        faculityDao.addFaculity(faculity);
    }

    @Override
    public void updateFaculity(Faculity faculity) {
        faculityDao.updateFaculity(faculity);
    }

    @Override
    public void deleteFaculity(int faculityId) {
        faculityDao.deleteFaculity(faculityId);
    }

    @Override
    public Faculity getFaculityById(int faculityId) {
        return faculityDao.getFaculityById(faculityId);
    }

    @Override
    public List<Faculity> getAllFaculities() {
        return faculityDao.getAllFaculities();
    }
}
