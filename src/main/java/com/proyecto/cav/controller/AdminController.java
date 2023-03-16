
package com.proyecto.cav.controller;

import com.proyecto.cav.domain.Admin;
import com.proyecto.cav.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AdminController {
    
    
    @Autowired
    private AdminService adminService;
    /*
    @GetMapping("/")
    public String conseguirAdministradores(Model model){
        model.addAttribute("administradores",adminService.getAdmins());
        return "index";
    }
    
    @GetMapping("/")
    public String conseguirAdmin(Admin admin,Model model){
        model.addAttribute("admini",adminService.getAdmin(admin));
        return "index";
    }
*/
    
}
