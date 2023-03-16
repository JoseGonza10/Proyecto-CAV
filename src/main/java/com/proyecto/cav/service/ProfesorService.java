
package com.proyecto.cav.service;

import com.proyecto.cav.domain.Profesor;
import java.util.List;


public interface ProfesorService {
    
    public List<Profesor> getProfesores();
    
    public void save(Profesor profesor);
    
    public void delete(Profesor profesor);
    
    public Profesor getProfesor(Profesor profesor);
    
}
