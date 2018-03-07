package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Period;
import com.bahaida.zooz.backend.services.IPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * <b>PeriodRestController is the class that manages the web layer of the Client period Services</b>
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
@RequestMapping("/api/periods")
public class PeriodRestController {
    @Autowired
    private IPeriodService periodService;

    /**
     * Retrieve all the periods.
     * @return A List data type.
     */
    @GetMapping
    public List<Period> getAll(){
        return periodService.findAll();
    }
    /**
     * Retrieve an period object by ID.
     * @param id A variable of type Long
     * @return A Period object.
     */
    @GetMapping("/{id}")
    public Period getById(@PathVariable("id")Long id){
        return periodService.findById(id);
    }


    /**
     * Add a new period object.
     * @param period An object of type Period
     * @return A new Period object.
     */
    @PostMapping
    public Period save(@RequestBody Period period) {

        return periodService.save(period);
    }
    /**
     * Update an period object.
     * @param id A variable of type Long
     * @param period An object of type Period
     * @return An Period object.
     */
    @PutMapping("/{id}")
    public Period update(@PathVariable("id") Long id, @RequestBody Period period){
        return periodService.update(id,period);
    }
    /**
     * Delete an period object by ID.
     * @param id A variable of type Long
     */
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id")Long id){
        periodService.delete(id);
    }
}
