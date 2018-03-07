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


    /**
     * Retrieve the value of Hammam id.
     * @return A Long data type.
     */
    public Long getIdHammam() {
        return idHammam;
    }
    /**
     * Set the value of Hammam id.
     * @param idHammam A variable of type Long.
     */
    public void setIdHammam(Long idHammam) {
        this.idHammam = idHammam;
    }
    /**
     * Retrieve the value of Hammam name.
     * @return A String data type.
     */
    public String getName() {
        return name;
    }
    /**
     * Set the value of Hammam name.
     * @param name A variable of type String.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Retrieve the value of Hammam clients.
     * @return A List data type.
     */
    public List<Client> getClients() {
        return clients;
    }
    /**
     * Set the value of Hammam clients.
     * @param clients A variable of type List.
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    /**
     * Retrieve the value of Hammam admins.
     * @return A List data type.
     */
    public List<Admin> getAdmins() {
        return admins;
    }
    /**
     * Set the value of Hammam admins.
     * @param admins A variable of type List.
     */
    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }
}
