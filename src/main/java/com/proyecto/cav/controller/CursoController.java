
package com.proyecto.cav.controller;

import com.proyecto.cav.domain.Curso;
import com.proyecto.cav.service.CursoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CursoController {
    
    @Autowired
    private CursoService cursoService;
    
    @GetMapping("/cursosAdm/listado")
    public String conseguirCursos(Model modelo){
        modelo.addAttribute("cursos",cursoService.getCursos());
        return "/cursosAdm/listado";
    }
    
    @GetMapping("/cursosAdm/nuevo")
    public String nuevoCurso(Curso curso) {
        return "/cursosAdm/modificar";
    }

    @PostMapping("/cursosAdm/guardar")
    public String guardarCurso(Curso curso) {
        cursoService.save(curso);
        return "redirect:/cursosAdm/listado";
    }

    @GetMapping("/cursosAdm/modificar/{id_curso}")
    public String modificarCurso(Curso curso, Model modelo) {
        curso = cursoService.getCurso(curso);
        modelo.addAttribute("curso", curso);
        modelo.addAttribute("id_curso", curso.getId_curso());
        
        return "/cursosAdm/modificar";
    }

    @GetMapping("/cursosAdm/eliminar/{id_curso}")
    public String eliminarCurso(Curso curso) {
        cursoService.delete(curso);
        return "redirect:/cursosAdm/listado";
    }
    
    
}
