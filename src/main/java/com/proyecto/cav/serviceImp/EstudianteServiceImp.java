
package com.proyecto.cav.serviceImp;

import com.proyecto.cav.dao.EstudianteDao;
import com.proyecto.cav.domain.Estudiante;
import com.proyecto.cav.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteServiceImp implements EstudianteService{

    @Autowired
    private EstudianteDao estudianteDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> getEstudiantes() {
        return (List<Estudiante>) estudianteDao.findAll();
    }

    @Override
    public void save(Estudiante estudiante) {
        estudianteDao.save(estudiante);
    }

    @Override
    public void delete(Estudiante estudiante) {
        estudianteDao.delete(estudiante);
    }

    @Override
    @Transactional(readOnly = true)
    public Estudiante getEstudiante(Estudiante estudiante) {
        return estudianteDao.findById(estudiante.getId_estudiante()).orElse(null);
    }
    
}
