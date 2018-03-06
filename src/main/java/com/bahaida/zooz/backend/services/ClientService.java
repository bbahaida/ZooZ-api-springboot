package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.persistence.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client registartion(Client client){

        if(client == null || client.getFirstName() == "" || client.getLastName() == "" || client.getLogin() == "" || client.getPassword() == "" || client.getAge() <= 0){
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
    public void update(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client login(String login, String password) {
        return clientRepository.login(login,password);
    }
}
