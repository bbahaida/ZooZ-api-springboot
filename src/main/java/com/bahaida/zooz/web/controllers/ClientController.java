package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ClientController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public List<Client> getAll(){
        return clientService.findAll();
    }

    @RequestMapping(value = "/clients/{id}", method = RequestMethod.GET)
    public Client getById(@PathVariable("id")Long id){
        return clientService.findById(id);
    }
    @RequestMapping(value = "/clients/age/{id}", method = RequestMethod.GET)
    public int getAge(@PathVariable("id")Long id){
        return clientService.getAge(id);
    }

    @RequestMapping(value = "/clients", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Client registration(@RequestBody Client client) {

        return clientService.registartion(client);
    }

    @RequestMapping(value = "/clients/login", method = RequestMethod.POST)
    public Client login(@RequestBody Client client) {

        return clientService.login(client.getLogin(),client.getPassword());
    }


    @RequestMapping(value = "/clients/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id, @RequestBody Client client){

        clientService.update(id,client);
    }

    @RequestMapping(value = "/clients/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable("id") Long id){
        clientService.delete(id);
    }
}
