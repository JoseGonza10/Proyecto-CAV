
package com.proyecto.cav.controller;

import com.proyecto.cav.domain.Estudiante;
import com.proyecto.cav.service.EstudianteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteService;
    
    @GetMapping("/gestionEstudiantes")
    public String conseguirEstudiantes(Model model){
        model.addAttribute("estudiantes",estudianteService.getEstudiantes());
        return "gestionEstudiantes";
    }
    

    
    /*
    @GetMapping("/")
    public String conseguirEstudiante(Estudiante estudiante,Model model){
        model.addAttribute("estude",estudianteService.getEstudiante(estudiante));
        return "index";
    }
    */
    
}
