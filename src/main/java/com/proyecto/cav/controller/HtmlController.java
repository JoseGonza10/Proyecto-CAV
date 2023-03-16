package com.proyecto.cav.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class HtmlController {
    
    @GetMapping("/index")
    public String indexViewer(){
        return "index";
    }

    @GetMapping("/register")
    public String registerViewer(){
        return "register";
    } 
    
    @GetMapping("/bienvenidoAdmin")
    public String bVAdminViewer(){
        return "bienvenidoAdmin";
    }  
    
    @GetMapping("/bienvenidoEstudiante")
    public String bVEstudianteViewer(){
        return "bienvenidoEstudiante";
    } 
    
    @GetMapping("/bienvenidoProfesor")
    public String bVProfesorViewer(){
        return "bienvenidoProfesor";
    }  
    
    @GetMapping("/certificacion")
    public String certificacionViewer(){
        return "certificacion";
    } 
    
    @GetMapping("/cambioCuenta")
    public String cambioCuentaViewer(){
        return "cambioCuenta";
    }
    
    @GetMapping("/loginEst")
    public String loginEstViewer(){
        return "loginEst";
    } 
    
    @GetMapping("/loginAdm")
    public String loginAdmViewer(){
        return "loginAdm";
    } 
    
    @GetMapping("/loginProf")
    public String loginProfViewer(){
        return "loginProf";
    } 
    
    @GetMapping("/extra")
    public String promocionViewer(){
        return "extra";
    } 
    
    @GetMapping("/areaIngenierias")
    public String areaIngenieriasViewer(){
        return "areaIngenierias";
    }
    
    @GetMapping("/areaSocial")
    public String areaSocialViewer(){
        return "areaSocial";
    }
    
    @GetMapping("/areaSalud")
    public String areaSaludViewer(){
        return "areaSalud";
    }
    
    @GetMapping("/areaIt")
    public String areaItViewer(){
        return "areaIt";
    }
}
