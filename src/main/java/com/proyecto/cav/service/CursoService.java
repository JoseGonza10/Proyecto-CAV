

package com.proyecto.cav.service;

import com.proyecto.cav.domain.Curso;
import java.util.List;

public interface CursoService {
    
    public List<Curso> getCursos();
    
    public void save(Curso curso);
    
    public void delete(Curso curso);
    
    public Curso getCurso(Curso curso);
    
}
