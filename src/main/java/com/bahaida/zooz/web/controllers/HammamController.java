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

public class HammamController {
    @Autowired
    private IHammamService hammamService;

    @RequestMapping(value = "/hammams", method = RequestMethod.GET)
    public List<Hammam> getAll(){
        return hammamService.findAll();
    }

    @RequestMapping(value = "/hammams", method = RequestMethod.POST)
    public Hammam save(@RequestBody Hammam hammam) {

        return hammamService.save(hammam);
    }


    @RequestMapping(value = "/hammams/{id}", method = RequestMethod.GET)
    public Hammam getById(@PathVariable("id")Long id){
        return hammamService.findById(id);
    }


    @RequestMapping(value = "/hammams/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id, @RequestBody Hammam hammam){
        hammamService.update(hammam);
    }
    @RequestMapping(value = "/hammams/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable("id")Long id){
        hammamService.delete(id);
    }
}
