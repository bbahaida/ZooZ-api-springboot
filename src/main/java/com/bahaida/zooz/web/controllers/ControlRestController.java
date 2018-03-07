package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Control;
import com.bahaida.zooz.backend.services.IControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlRestController {

    @Autowired
    private IControlService controlService;

    @RequestMapping(value = "/controls", method = RequestMethod.GET)
    public List<Control> getAll(){
        return controlService.findAll();
    }

    @RequestMapping(value = "/controls", method = RequestMethod.POST)
    public Control save(@RequestBody Control control) {

        return controlService.save(control);
    }


    @RequestMapping(value = "/controls/{id}", method = RequestMethod.GET)
    public Control getById(@PathVariable("id")Long id){
        return controlService.findById(id);
    }


    @RequestMapping(value = "/controls/{id}", method = RequestMethod.PUT)
    public Control update(@PathVariable("id") Long id, @RequestBody Control control){
        return controlService.update(id,control);
    }
    @RequestMapping(value = "/controls/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable("id")Long id){
        controlService.delete(id);
    }
}
