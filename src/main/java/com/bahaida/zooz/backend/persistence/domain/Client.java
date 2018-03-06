package com.bahaida.zooz.backend.persistence.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Client implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private int age;

    @ManyToOne
    @JoinColumn(name = "id_hammam")
    private Hammam hammam;

    public Client() {
    }

    public Client(String firstName, String lastName, String login, String password, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @JsonIgnore
    public Hammam getHammam() {
        return hammam;
    }
    @JsonSetter
    public void setHammam(Hammam hammam) {
        this.hammam = hammam;
    }
}
