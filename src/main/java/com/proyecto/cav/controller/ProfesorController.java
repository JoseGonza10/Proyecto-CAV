
package com.proyecto.cav.controller;

import com.proyecto.cav.domain.Profesor;
import com.proyecto.cav.service.ProfesorService;
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
public class ProfesorController {
    
    @Autowired
    private ProfesorService profesorService;
    
        @GetMapping("/profesorAdm/listado")
    public String conseguirProfesores(Model model){
        model.addAttribute("profesores",profesorService.getProfesores());
        return "/profesorAdm/listado";
    }
    
    @GetMapping("/profesorAdm/nuevo")
    public String nuevoProfesor(Profesor profesor) {
        return "/profesorAdm/modificar";
    }

    @PostMapping("/profesorAdm/guardar")
    public String guardarProfesor(Profesor profesor) {
        profesorService.save(profesor);
        return "redirect:/profesorAdm/listado";
    }

    @GetMapping("/profesorAdm/modificar/{id_profesor}")
    public String modificarProfesor(Profesor profesor, Model modelo) {
        profesor = profesorService.getProfesor(profesor);
        modelo.addAttribute("profesor", profesor);
        modelo.addAttribute("id_profesor", profesor.getId_profesor());
        modelo.addAttribute("id_especializacion",profesor.getId_especializacion());
        return "/profesorAdm/modificar";
    }

    @GetMapping("/profesorAdm/eliminar/{id_profesor}")
    public String eliminarProfesor(Profesor profesor) {
        profesorService.delete(profesor);
        return "redirect:/profesorAdm/listado";
    }
    
}
