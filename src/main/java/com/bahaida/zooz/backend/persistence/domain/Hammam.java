package com.bahaida.zooz.backend.persistence.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Hammam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHammam;

    private String name;

    @OneToMany(mappedBy = "hammam", fetch = FetchType.EAGER)
    private List<Client> clients;

    @OneToMany(mappedBy = "hammam", fetch = FetchType.LAZY)
    private List<Admin> admins;

    public Hammam() {
    }

    public Hammam(String name) {
        this.name = name;
    }

    public Long getIdHammam() {
        return idHammam;
    }

    public void setIdHammam(Long idHammam) {
        this.idHammam = idHammam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }
}
