package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import com.bahaida.zooz.backend.services.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * <b>AdminRestController is the class that manages the web layer of the Admin Services</b>
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
@RequestMapping("/api/admins")
public class AdminRestController {
    @Autowired
    private IAdminService adminService;

    /**
     * Retrieve all the admins.
     * @return A List data type.
     */
    @GetMapping
    public List<Admin> getAll(){
        return adminService.findAll();
    }

    /**
     * Retrieve an admin object by ID.
     * @param id A variable of type Long
     * @return An Admin object.
     */
    @GetMapping("/{id}")
    public Admin getById(@PathVariable("id")Long id){
        return adminService.findById(id);
    }
    /**
     * Add a new admin object.
     * @param admin An object of type Admin
     * @return A new Admin object.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Admin registration(@RequestBody Admin admin) {
        return adminService.registartion(admin);
    }
    /**
     * Retrieve an admin object by login and password.
     * @param admin An object of type Admin contains only login and password
     * @return A new Admin object.
     */
    @PostMapping("/login")
    public Admin login(@RequestBody Admin admin) {

        return adminService.login(admin.getLogin(),admin.getPassword());
    }

    /**
     * Update an admin object.
     * @param id A variable of type Long
     * @param admin An object of type Admin
     * @return An Admin object.
     */
    @PutMapping("/{id}")
    public Admin update(@PathVariable("id") Long id, @RequestBody Admin admin){
        return adminService.update(id,admin);
    }
    /**
     * Delete an admin object by ID.
     * @param id A variable of type Long
     */
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long id){
        adminService.delete(id);
    }
}
