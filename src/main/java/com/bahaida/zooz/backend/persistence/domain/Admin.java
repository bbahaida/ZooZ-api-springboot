package com.bahaida.zooz.backend.persistence.domain;


import com.bahaida.zooz.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Admin implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;

    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "id_hamam")
    private Hammam hammam;

    public Admin() {
    }

    public Admin(String firstName, String lastName, String login, String password, String email, String phone, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    /**
     * Retrieve the value of Admin id.
     * @return A Long data type.
     */
    public Long getIdAdmin() {
        return idAdmin;
    }

    /**
     * Set the value of Admin id.
     * @param idAdmin A variable of type Long.
     */
    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
    }

    /**
     * Retrieve the value of Admin first name.
     * @return A String data type.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of Admin first name.
     * @param firstName A variable of type String.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Retrieve the value of Admin first name.
     * @return A String data type.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Set the value of Admin last name.
     * @param lastName A variable of type String.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Retrieve the value of Admin login.
     * @return A String data type.
     */
    public String getLogin() {
        return login;
    }
    /**
     * Set the value of Admin login.
     * @param login A variable of type String.
     */
    public void setLogin(String login) {
        this.login = login;
    }
    /**
     * Retrieve the value of Admin first name.
     * @return A String data type.
     */
    public String getPassword() {
        return password;
    }
    /**
     * Set the value of Admin password.
     * @param password A variable of type String.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Retrieve the value of Admin email.
     * @return A String data type.
     */
    public String getEmail() {
        return email;
    }
    /**
     * Set the value of Admin email.
     * @param email A variable of type String.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Retrieve the value of Admin phone.
     * @return A String data type.
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Set the value of Admin phone.
     * @param phone A variable of type String.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * Retrieve the value of Admin role.
     * @return An enum data type.
     */
    public Role getRole() {
        return role;
    }
    /**
     * Set the value of Admin role.
     * @param role A variable of type enum.
     */
    public void setRole(Role role) {
        this.role = role;
    }
    /**
     * Retrieve the value of Hammam that the admin belong to.
     * @return A Hammam data type.
     */
    @JsonIgnore
    public Hammam getHammam() {
        return hammam;
    }
    /**
     * Set the value of Hammam that the admin belong to.
     * @param hammam An Object of type Hammam.
     */
    @JsonSetter
    public void setHammam(Hammam hammam) {
        this.hammam = hammam;
    }
}
