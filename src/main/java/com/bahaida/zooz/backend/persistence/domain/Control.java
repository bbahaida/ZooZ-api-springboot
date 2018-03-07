package com.bahaida.zooz.backend.persistence.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Control implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idControl;
    private boolean result;
    @Temporal(TemporalType.DATE)
    private Date dateControl;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    public Control() {
    }

    public Control(boolean result, Date dateControl) {
        this.result = result;
        this.dateControl = dateControl;
    }
    /**
     * Retrieve the value of Client control id.
     * @return A Long data type.
     */
    @JsonIgnore
    public Long getIdControl() {
        return idControl;
    }
    /**
     * Set the value of Client control id.
     * @param idControl A variable of type Long.
     */
    @JsonSetter
    public void setIdControl(Long idControl) {
        this.idControl = idControl;
    }
    /**
     * Retrieve the value of control result.
     * @return A boolean data type.
     */
    public boolean isResult() {
        return result;
    }
    /**
     * Set the value of control result.
     * @param result A variable of type boolean.
     */
    public void setResult(boolean result) {
        this.result = result;
    }
    /**
     * Retrieve the value of control date.
     * @return A Date data type.
     */
    public Date getDateControl() {
        return dateControl;
    }
    /**
     * Set the value of control date.
     * @param dateControl A variable of type Date.
     */
    public void setDateControl(Date dateControl) {
        this.dateControl = dateControl;
    }
    /**
     * Retrieve the value of Client object.
     * @return A Client data type.
     */
    @JsonIgnore
    public Client getClient() {
        return client;
    }
    /**
     * Set the value of Client object.
     * @param client A variable of type Client.
     */
    @JsonSetter
    public void setClient(Client client) {
        this.client = client;
    }
}
