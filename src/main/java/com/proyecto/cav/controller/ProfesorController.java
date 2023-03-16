
package com.proyecto.cav.controller;

import com.proyecto.cav.service.ProfesorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
public class ProfesorController {
    
    @Autowired
    private ProfesorService profesorService;
    
        @GetMapping("/gestionProfesores")
    public String conseguirProfesores(Model model){
        model.addAttribute("profesores",profesorService.getProfesores());
        return "gestionProfesores";
    }
    
}
