package com.proyecto.cav.service;

import com.proyecto.cav.domain.Matricula;
import java.util.List;

public interface MatriculaService {
    
    public List<Matricula> getMatriculas();
    
    public void save(Matricula matricula);
    
    public void delete(Matricula matricula);
    
}
