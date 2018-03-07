package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Control;
import com.bahaida.zooz.backend.services.IControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * <b>ControlRestController is the class that manages the web layer of the Client control Services</b>
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
@RequestMapping("/api/controls")
public class ControlRestController {

    @Autowired
    private IControlService controlService;
    /**
     * Retrieve all the controls.
     * @return A List data type.
     */
    @GetMapping
    public List<Control> getAll(){
        return controlService.findAll();
    }
    /**
     * Retrieve an control object by ID.
     * @param id A variable of type Long
     * @return A Control object.
     */
    @GetMapping("/{id}")
    public Control getById(@PathVariable("id")Long id){
        return controlService.findById(id);
    }
    /**
     * Add a new control object.
     * @param control An object of type Control
     * @return A new Control object.
     */
    @PostMapping
    public Control save(@RequestBody Control control) {

        return controlService.save(control);
    }

    /**
     * Update an control object.
     * @param id A variable of type Long
     * @param control An object of type Control
     * @return An Control object.
     */
    @PutMapping("/{id}")
    public Control update(@PathVariable("id") Long id, @RequestBody Control control){
        return controlService.update(id,control);
    }
    /**
     * Delete an control object by ID.
     * @param id A variable of type Long
     */
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id")Long id){
        controlService.delete(id);
    }
}
