package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * <b>ClientRestController is the class that manages the web layer of the Client Services</b>
 *
 * <p>more details on <strong><i>{servername}/swagger-ui.html</i></strong></p>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */

@RestController
@RequestMapping("/api/clients")
public class ClientRestController {

    @Autowired
    private IClientService clientService;

    /**
     * Retrieve all the clients.
     * @return A List data type.
     */
    @GetMapping
    public List<Client> getAll(){
        return clientService.findAll();
    }

    /**
     * Retrieve an client object by ID.
     * @param id A variable of type Long
     * @return A Client object.
     */
    @GetMapping("/{id}")
    public Client getById(@PathVariable("id")Long id){
        return clientService.findById(id);
    }

    /**
     * Add a new client object.
     * @param client An object of type Client
     * @return A new Client object.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client registration(@RequestBody Client client) {

        return clientService.registartion(client);
    }

    /**
     * Retrieve a client object by login and password.
     * @param client An object of type Client contains only login and password
     * @return A new Client object.
     */
    @PostMapping("/login")
    public Client login(@RequestBody Client client) {

        return clientService.login(client.getLogin(),client.getPassword());
    }

    /**
     * Update an client object.
     * @param id A variable of type Long
     * @param client An object of type Client
     * @return An Client object.
     */
    @PutMapping("/{id}")
    public Client update(@PathVariable("id") Long id, @RequestBody Client client){

        return clientService.update(id,client);
    }
    /**
     * Delete an client object by ID.
     * @param id A variable of type Long
     */
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long id){
        clientService.delete(id);
    }
}
