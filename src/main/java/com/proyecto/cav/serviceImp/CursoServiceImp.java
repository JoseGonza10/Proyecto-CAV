
package com.proyecto.cav.serviceImp;

import com.proyecto.cav.dao.CursoDao;
import com.proyecto.cav.domain.Curso;
import com.proyecto.cav.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CursoServiceImp implements CursoService{
    
    @Autowired
    private CursoDao cursoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Curso> getCursos() {
        return (List<Curso>) cursoDao.findAll();
    }

    @Override
    public void save(Curso curso) {
        cursoDao.save(curso);
    }

    @Override
    public void delete(Curso curso) {
        cursoDao.delete(curso);
    }

    @Override
    @Transactional(readOnly = true)
    public Curso getCurso(Curso curso) {
        return cursoDao.findById(curso.getId_curso()).orElse(null);
    }
    
}
