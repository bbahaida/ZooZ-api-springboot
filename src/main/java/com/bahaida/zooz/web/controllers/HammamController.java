package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.persistence.domain.Hammam;
import com.bahaida.zooz.backend.services.IClientService;
import com.bahaida.zooz.backend.services.IHammamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hammams")
public class HammamController {
    @Autowired
    private IHammamService hammamService;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Hammam> getAll(){
        return hammamService.findAll();
    }
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Hammam save(@RequestBody Hammam hammam) {

        return hammamService.save(hammam);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{id}"
    )
    public Hammam getById(@PathVariable("id")Long id){
        return hammamService.findById(id);
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void update(@RequestBody Hammam hammam){
        hammamService.update(hammam);
    }
    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "{id}"

    )
    public void remove(@PathVariable("id")Long id){
        hammamService.delete(id);
    }
}
