
package com.proyecto.cav.serviceImp;

import com.proyecto.cav.dao.AdminDao;
import com.proyecto.cav.domain.Admin;
import com.proyecto.cav.service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImp implements AdminService{
    
    @Autowired
    private AdminDao adminDao;

    @Override
    @Transactional(readOnly = true)
    public List<Admin> getAdmins() {
        return (List<Admin>) adminDao.findAll();
    }

    @Override
    public void save(Admin admin) {
       adminDao.save(admin);
    }

    @Override
    public void delete(Admin admin) {
       adminDao.delete(admin);
    }

    @Override
    @Transactional(readOnly = true)
    public Admin getAdmin(Admin admin) {
        return adminDao.findById(admin.getId_admin()).orElse(null);
    }
    
}
