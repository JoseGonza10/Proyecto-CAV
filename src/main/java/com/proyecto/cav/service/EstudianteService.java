
package com.proyecto.cav.service;

import com.proyecto.cav.domain.Estudiante;
import java.util.List;


public interface EstudianteService {
    
    public List<Estudiante> getEstudiantes();
    
    public void save(Estudiante estudiante);
    
    public void delete(Estudiante estudiante);
    
    public Estudiante getEstudiante(Estudiante estudiante);
    
}
