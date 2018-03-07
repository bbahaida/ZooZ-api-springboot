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

    /**
     * Retrieve the value of Client id.
     * @return A Long data type.
     */
    public Long getIdClient() {
        return idClient;
    }
    /**
     * Set the value of Client id.
     * @param idClient A variable of type Long.
     */
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }
    /**
     * Retrieve the value of Client first name.
     * @return A String data type.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of Client first name.
     * @param firstName A variable of type String.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Retrieve the value of Client last name.
     * @return A String data type.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Set the value of Client last name.
     * @param lastName A variable of type String.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Retrieve the value of Client login.
     * @return A String data type.
     */
    public String getLogin() {
        return login;
    }
    /**
     * Set the value of Client login.
     * @param login A variable of type String.
     */
    public void setLogin(String login) {
        this.login = login;
    }
    /**
     * Retrieve the value of Client first name.
     * @return A String data type.
     */
    public String getPassword() {
        return password;
    }
    /**
     * Set the value of Client password.
     * @param password A variable of type String.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Retrieve the value of Client email.
     * @return A String data type.
     */
    public String getEmail() {
        return email;
    }
    /**
     * Set the value of Client email.
     * @param email A variable of type String.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Retrieve the value of Client phone.
     * @return A String data type.
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Set the value of Client phone.
     * @param phone A variable of type String.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * Retrieve the value of Client number of children.
     * @return An int data type.
     */
    public int getNbChildren() {
        return nbChildren;
    }
    /**
     * Set the value of Client number of children.
     * @param nbChildren A variable of type int.
     */
    public void setNbChildren(int nbChildren) {
        this.nbChildren = nbChildren;
    }
    /**
     * Retrieve the value of Client birthday.
     * @return A Date data type.
     */
    public Date getBirthday() {
        return birthday;
    }
    /**
     * Set the value of Client phone.
     * @param birthday A variable of type Date.
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    /**
     * Retrieve the value of Client menopause status.
     * @return A boolean data type.
     */
    public boolean isMenopause() {
        return menopause;
    }
    /**
     * Set the value of Client menopause status.
     * @param menopause A variable of type boolean.
     */
    public void setMenopause(boolean menopause) {
        this.menopause = menopause;
    }
    /**
     * Retrieve the value of Client periods.
     * @return A List data type.
     */
    public List<Period> getPeriods() {
        return periods;
    }
    /**
     * Set the value of Client periods.
     * @param periods A variable of type List.
     */
    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }
    /**
     * Retrieve the value of Client hammam.
     * @return A Hammam Object type.
     */
    @JsonIgnore
    public Hammam getHammam() {
        return hammam;
    }
    /**
     * Set the value of Client hammam.
     * @param hammam An object of Hammam.
     */
    @JsonSetter
    public void setHammam(Hammam hammam) {
        this.hammam = hammam;
    }
    /**
     * Retrieve the value of Client controls.
     * @return A List data type.
     */
    public List<Control> getControls() {
        return controls;
    }
    /**
     * Set the value of Client controls.
     * @param controls A variable of type List.
     */
    public void setControls(List<Control> controls) {
        this.controls = controls;
    }
}
