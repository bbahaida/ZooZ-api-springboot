package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Client> getAll(){
        return clientService.findAll();
    }
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public Client registration(@RequestBody Client client) {

        return clientService.registartion(client);
    }



    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{id}"
    )
    public Client getById(@PathVariable("id")Long id){
        return clientService.findById(id);
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void update(@RequestBody Client client){
        clientService.update(client);
    }
    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "{id}"

    )
    public void remove(@PathVariable("id")Long id){
        clientService.delete(id);
    }
}
