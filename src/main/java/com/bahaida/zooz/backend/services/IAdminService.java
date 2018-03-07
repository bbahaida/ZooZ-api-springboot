package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import com.bahaida.zooz.backend.persistence.domain.Client;

import java.util.List;

/**
 *
 * <b>IAdminService is the interface that manages the business layer of the Admin Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */

public interface IAdminService {
    Admin registartion(Admin admin);
    List<Admin> findAll();
    Admin findById(Long id);
    Admin update(Long id, Admin admin);

    void delete(Long id);

    Admin login(String login, String password);
}
