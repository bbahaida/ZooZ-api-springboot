package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.persistence.domain.Hammam;
import com.bahaida.zooz.backend.services.IClientService;
import com.bahaida.zooz.backend.services.IHammamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * <b>HammamRestController is the class that manages the web layer of the Hammmam Services</b>
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
@RequestMapping("/api/hammams")
public class HammamRestController {
    @Autowired
    private IHammamService hammamService;

    /**
     * Retrieve all the hammams.
     * @return A List data type.
     */
    @GetMapping
    public List<Hammam> getAll(){
        return hammamService.findAll();
    }
    /**
     * Retrieve an hammam object by ID.
     * @param id A variable of type Long
     * @return A Hammam object.
     */
    @GetMapping("/{id}")
    public Hammam getById(@PathVariable("id")Long id){
        return hammamService.findById(id);
    }
    /**
     * Add a new hammam object.
     * @param hammam An object of type Hammam
     * @return A new Hammam object.
     */
    @PostMapping
    public Hammam save(@RequestBody Hammam hammam) {

        return hammamService.save(hammam);
    }
    /**
     * Update an hammam object.
     * @param id A variable of type Long
     * @param hammam An object of type Hammam
     * @return An Hammam object.
     */
    @PutMapping("/{id}")
    public Hammam update(@PathVariable("id") Long id, @RequestBody Hammam hammam){
        return hammamService.update(id,hammam);
    }
    /**
     * Delete an hammam object by ID.
     * @param id A variable of type Long
     */
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id")Long id){
        hammamService.delete(id);
    }
}
