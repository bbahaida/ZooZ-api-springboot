package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import com.bahaida.zooz.backend.persistence.domain.Client;

import java.util.List;

/**
 *
 * <b>IClientService is the interface that manages the business layer of the Client Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */
public interface IClientService {
    Client registartion(Client client);
    List<Client> findAll();
    Client findById(Long id);
    int getAge(Long id);
    Client update(Long id, Client client);

    void delete(Long id);

    Client login(String login, String password);
}
