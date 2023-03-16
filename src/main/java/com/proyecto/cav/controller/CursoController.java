
package com.proyecto.cav.controller;

import com.proyecto.cav.service.CursoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class CursoController {
    
    @Autowired
    private CursoService cursoService;
    
    @GetMapping("/gestionCursos")
    public String conseguirProfesores(Model model){
        model.addAttribute("cursos",cursoService.getCursos());
        return "gestionCursos";
    }
    
    
}
