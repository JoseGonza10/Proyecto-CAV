
package com.proyecto.cav.serviceImp;

import com.proyecto.cav.dao.MatriculaDao;
import com.proyecto.cav.domain.Estudiante;
import com.proyecto.cav.domain.Matricula;
import com.proyecto.cav.service.MatriculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MatriculaServiceImp implements MatriculaService{
    
    @Autowired
    private MatriculaDao matriculaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Matricula> getMatriculas() {
        return (List<Matricula>) matriculaDao.findAll();
    }
    
    @Override
    public void save(Matricula matricula) {
        matriculaDao.save(matricula);
    }

    @Override
    public void delete(Matricula matricula) {
        matriculaDao.delete(matricula);
    }
    
}
