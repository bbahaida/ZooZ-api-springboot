package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.persistence.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClientService implements IClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client registartion(Client client){

        if(client == null || client.getFirstName() == "" || client.getLastName() == "" || client.getLogin() == "" || client.getPassword() == "" || client.getBirthday() == null){
            return null;
        }
        return clientRepository.save(client);

    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.getOne(id);
    }

    @Override
    public Client update(Long id, Client client) {

        Client c = clientRepository.getOne(id);
        c.setFirstName(client.getFirstName() == null ? c.getFirstName() : client.getFirstName());
        c.setLastName(client.getLastName() == null ? c.getLastName() : client.getLastName());
        c.setLogin(client.getLogin() == null ? c.getLogin() : client.getLogin());
        c.setPassword(client.getPassword() == null ? c.getPassword() : client.getPassword());
        c.setEmail(client.getEmail() == null ? c.getEmail() : client.getEmail());
        c.setPhone(client.getPhone() == null ? c.getPhone() : client.getPhone());
        c.setNbChildren(client.getNbChildren() <= 0 ? c.getNbChildren() : client.getNbChildren());
        c.setMenopause(client.isMenopause() == c.isMenopause() ? c.isMenopause() : client.isMenopause());


        return clientRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client login(String login, String password) {
        return clientRepository.login(login,password);
    }

    @Override
    public int getAge(Long id) {
        return new Date().getYear() - clientRepository.getOne(id).getBirthday().getYear();
    }
}
