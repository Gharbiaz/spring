package tn.sesame.secproject.service;

import tn.sesame.secproject.entities.Admin;
import tn.sesame.secproject.entities.Agence;

import java.util.List;

public interface IAgenceAdminService {
    public List<Agence> getAgences();
    public Agence getAgence(int id);
    public Agence addAgence(Agence agence);
    public Agence updateAgence(Agence agence);
    public void deleteAgence(int id);

    public List<Admin> getAdmins();
    public Admin getAdmin(int id);
    public Admin addAdmin(Admin admin);
    public Admin updateAdmin(Admin admin);
    public void deleteAdmin(int id);

}