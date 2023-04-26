package com.proyecto.cav.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HtmlController {

    @GetMapping("/index")
    public String indexViewer() {
        return "index";
    }

    @GetMapping("/register")
    public String registerViewer() {
        return "register";
    }

    @GetMapping("/bienvenidoAdmin")
    public String bVAdminViewer() {
        return "bienvenidoAdmin";
    }

    @GetMapping("/bienvenidoEstudiante")
    public String bVEstudianteViewer() {
        return "bienvenidoEstudiante";
    }

    @GetMapping("/estudiante/bienvenidoEstudiante")
    public String retornarBienvenidoEstudiante() {
        return "/estudiante/bienvenidoEstudiante";
    }

    @GetMapping("/bienvenidoProfesor")
    public String bVProfesorViewer() {
        return "bienvenidoProfesor";
    }

    @GetMapping("/certificacion")
    public String certificacionViewer() {
        return "certificacion";
    }

    @GetMapping("/cambioCuenta")
    public String cambioCuentaViewer() {
        return "cambioCuenta";
    }

    @GetMapping("/loginEst")
    public String loginEstViewer() {
        return "loginEst";
    }

    @GetMapping("/loginAdm")
    public String loginAdmViewer() {
        return "loginAdm";
    }

    @GetMapping("/loginProf")
    public String loginProfViewer() {
        return "loginProf";
    }

    @GetMapping("/extra")
    public String promocionViewer() {
        return "extra";
    }

    @GetMapping("/areas/areaIngenierias")
    public String areaIngenieriaViewer() {
        return "/areas/areaIngenierias";
    }

    @GetMapping("/areas/areaIt")
    public String areaItViewer() {
        return "/areas/areaIt";
    }

    @GetMapping("/areas/areaSocial")
    public String areaSocialViewer() {
        return "/areas/areaSocial";
    }

    @GetMapping("/areas/areaSalud")
    public String areaSaludViewer() {
        return "/areas/areaSalud";
    }
}
