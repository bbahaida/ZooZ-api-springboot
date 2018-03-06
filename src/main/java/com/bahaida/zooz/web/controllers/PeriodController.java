package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Period;
import com.bahaida.zooz.backend.services.IPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeriodController {
    @Autowired
    private IPeriodService periodService;

    @RequestMapping(value = "/periods", method = RequestMethod.GET)
    public List<Period> getAll(){
        return periodService.findAll();
    }

    @RequestMapping(value = "/periods", method = RequestMethod.POST)
    public Period save(@RequestBody Period period) {

        return periodService.save(period);
    }


    @RequestMapping(value = "/periods/{id}", method = RequestMethod.GET)
    public Period getById(@PathVariable("id")Long id){
        return periodService.findById(id);
    }


    @RequestMapping(value = "/periods/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id, @RequestBody Period period){
        periodService.update(period);
    }
    @RequestMapping(value = "/periods/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable("id")Long id){
        periodService.delete(id);
    }
}
