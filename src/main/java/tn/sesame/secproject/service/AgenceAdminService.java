package tn.sesame.secproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sesame.secproject.entities.Admin;
import tn.sesame.secproject.entities.Agence;
import tn.sesame.secproject.repository.IAdminRepository;
import tn.sesame.secproject.repository.IAgenceRepository;

import java.util.List;

@Service
public class AgenceAdminService implements IAgenceAdminService{

    @Autowired
    IAgenceRepository agenceRepository;
    @Autowired
    IAdminRepository adminRepository;

    @Override
    public List<Agence> getAgences() {
        return (List<Agence>) agenceRepository.findAll();
    }

    @Override
    public Agence getAgence(int id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(int id) {
        agenceRepository.deleteById(id);
    }

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