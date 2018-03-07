package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import com.bahaida.zooz.backend.persistence.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements IAdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin registartion(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public Admin findById(Long id) {
        return adminRepository.getOne(id);
    }

    @Override
    public Admin update(Long id, Admin admin) {
        Admin a = adminRepository.getOne(id);
        a.setFirstName(admin.getFirstName() == null ? a.getFirstName() : admin.getFirstName());
        a.setLastName(admin.getLastName() == null ? a.getLastName() : admin.getLastName());
        a.setLogin(admin.getLogin() == null ? a.getLogin() : admin.getLogin());
        a.setPassword(admin.getPassword() == null ? a.getPassword() : admin.getPassword());
        a.setEmail(admin.getEmail() == null ? a.getEmail() : admin.getEmail());
        a.setPhone(admin.getPhone() == null ? a.getPhone() : admin.getPhone());
        a.setRole(admin.getRole() == null ? a.getRole() : admin.getRole());


        return adminRepository.save(a);
    }

    @Override
    public void delete(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public Admin login(String login, String password) {
        return adminRepository.login(login,password);
    }
}
