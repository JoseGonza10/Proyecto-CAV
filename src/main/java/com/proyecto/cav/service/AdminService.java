
package com.proyecto.cav.service;

import com.proyecto.cav.domain.Admin;
import java.util.List;

public interface AdminService {
    
    public List<Admin> getAdmins();
    
    public void save(Admin admin);
    
    public void delete(Admin admin);
    
    public Admin getAdmin(Admin admin);
    
}
