package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import com.bahaida.zooz.backend.persistence.domain.Client;

import java.util.List;

public interface IAdminService {
    Admin registartion(Admin admin);
    List<Admin> findAll();
    Admin findById(Long id);
    Admin update(Long id, Admin admin);

    void delete(Long id);

    Admin login(String login, String password);
}
