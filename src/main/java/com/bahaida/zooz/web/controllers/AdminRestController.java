package com.bahaida.zooz.web.controllers;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import com.bahaida.zooz.backend.services.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminRestController {
    @Autowired
    private IAdminService adminService;

    @RequestMapping(value = "/admins", method = RequestMethod.GET)
    public List<Admin> getAll(){
        return adminService.findAll();
    }

    @RequestMapping(value = "/admins/{id}", method = RequestMethod.GET)
    public Admin getById(@PathVariable("id")Long id){
        return adminService.findById(id);
    }

    @RequestMapping(value = "/admins", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Admin registration(@RequestBody Admin admin) {
        return adminService.registartion(admin);
    }

    @RequestMapping(value = "/admins/login", method = RequestMethod.POST)
    public Admin login(@RequestBody Admin admin) {

        return adminService.login(admin.getLogin(),admin.getPassword());
    }


    @RequestMapping(value = "/admins/{id}", method = RequestMethod.PUT)
    public Admin update(@PathVariable("id") Long id, @RequestBody Admin admin){
        return adminService.update(id,admin);
    }

    @RequestMapping(value = "/admins/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable("id") Long id){
        adminService.delete(id);
    }
}
