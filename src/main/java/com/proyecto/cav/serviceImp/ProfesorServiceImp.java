
package com.proyecto.cav.serviceImp;

import com.proyecto.cav.dao.ProfesorDao;
import com.proyecto.cav.domain.Profesor;
import com.proyecto.cav.service.ProfesorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfesorServiceImp implements ProfesorService{
    
    @Autowired
    private ProfesorDao profesorDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Profesor> getProfesores() {
        return (List<Profesor>) profesorDao.findAll();
    }

    @Override
    public void save(Profesor profesor) {
        profesorDao.save(profesor);
    }

    @Override
    public void delete(Profesor profesor) {
        profesorDao.delete(profesor);
    }

    @Override
    @Transactional(readOnly = true)
    public Profesor getProfesor(Profesor profesor) {
        return profesorDao.findById(profesor.getId_profesor()).orElse(null);
    }
    
    
}
