package com.bahaida.zooz.backend.persistence.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private String phone;
    private int nbChildren;
    @Temporal(TemporalType.DATE)
    private Date birthday;

    private boolean menopause;


    @ManyToOne
    @JoinColumn(name = "id_hammam")
    private Hammam hammam;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Period> periods;

    @OneToMany(mappedBy = "client")
    private List<Control> controls;

    public Client() {
        setMenopause(false);
    }

    public Client(String firstName, String lastName, String login, String password, String email, String phone, int nbChildren, Date birthday, boolean menopause) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.nbChildren = nbChildren;
        this.birthday = birthday;
        this.menopause = menopause;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNbChildren() {
        return nbChildren;
    }

    public void setNbChildren(int nbChildren) {
        this.nbChildren = nbChildren;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isMenopause() {
        return menopause;
    }

    public void setMenopause(boolean menopause) {
        this.menopause = menopause;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    @JsonIgnore
    public Hammam getHammam() {
        return hammam;
    }
    @JsonSetter
    public void setHammam(Hammam hammam) {
        this.hammam = hammam;
    }

    public List<Control> getControls() {
        return controls;
    }

    public void setControls(List<Control> controls) {
        this.controls = controls;
    }
}
