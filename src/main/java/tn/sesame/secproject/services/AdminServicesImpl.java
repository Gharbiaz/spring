package tn.sesame.secproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sesame.secproject.entities.Admin;
import tn.sesame.secproject.entities.Agence;
import tn.sesame.secproject.repository.IAdminRepository;


import java.util.List;

@Service
public class AdminServicesImpl implements IAdminServices {


    @Autowired
    IAdminRepository adminRepository;


    @Override
    public List<Admin> getAdmins() {
        return (List<Admin>) adminRepository.findAll();
    }

    @Override
    public Admin getAdmin(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }

}
