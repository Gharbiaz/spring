package tn.sesame.secproject.controller;

import tn.sesame.secproject.entities.Admin;
import tn.sesame.secproject.services.IAdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private IAdminServices adminServices;

    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminServices.getAdmins();
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable int id) {
        return adminServices.getAdmin(id);
    }

    @PostMapping("/addAdmin")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminServices.addAdmin(admin);
    }

    @PutMapping("/updateAdmin/{id}")
    public Admin updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
        admin.setId(id);
        return adminServices.updateAdmin(admin);
    }

    @DeleteMapping("/deleteAdmin/{id}")
    public void deleteAdmin(@PathVariable int id) {
        adminServices.deleteAdmin(id);
    }
}