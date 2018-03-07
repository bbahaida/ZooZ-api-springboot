package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import com.bahaida.zooz.backend.persistence.domain.Client;

import java.util.List;

public interface IClientService {
    Client registartion(Client client);
    List<Client> findAll();
    Client findById(Long id);
    int getAge(Long id);
    Client update(Long id, Client client);

    void delete(Long id);

    Client login(String login, String password);
}
