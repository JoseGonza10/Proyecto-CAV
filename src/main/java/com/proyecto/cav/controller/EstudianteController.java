
package com.proyecto.cav.controller;

import com.proyecto.cav.domain.Estudiante;
import com.proyecto.cav.service.EstudianteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteService;
    
    @GetMapping("/estudianteAdm/listado")
    public String conseguirEstudiantes(Model model){
        model.addAttribute("estudiantes",estudianteService.getEstudiantes());
        return "/estudianteAdm/listado";
    }
    
    @GetMapping("/estudianteAdm/nuevo")
    public String nuevoEstudiante(Estudiante estudiante) {
        return "/estudianteAdm/modificar";
    }

    @PostMapping("/estudianteAdm/guardar")
    public String guardarEstudiante(Estudiante estudiante) {
        estudianteService.save(estudiante);
        return "redirect:/estudianteAdm/listado";
    }

    @GetMapping("/estudianteAdm/modificar/{id_estudiante}")
    public String modificarEstudiante(Estudiante estudiante, Model modelo) {
        estudiante = estudianteService.getEstudiante(estudiante);
        modelo.addAttribute("estudiante", estudiante);
        modelo.addAttribute("id_estudiante", estudiante.getId_estudiante());
        
        return "/estudianteAdm/modificar";
    }

    @GetMapping("/estudianteAdm/eliminar/{id_estudiante}")
    public String eliminarEstudiante(Estudiante estudiante) {
        estudianteService.delete(estudiante);
        return "redirect:/estudianteAdm/listado";
    }

    

    
}
