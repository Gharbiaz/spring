package tn.sesame.secproject.services;


import tn.sesame.secproject.entities.Admin;

import java.util.List;

public interface IAdminServices {

    public List<Admin> getAdmins();
    public Admin getAdmin(int id);
    public Admin addAdmin(Admin admin);
    public Admin updateAdmin(Admin admin);
    public void deleteAdmin(int id);

}

