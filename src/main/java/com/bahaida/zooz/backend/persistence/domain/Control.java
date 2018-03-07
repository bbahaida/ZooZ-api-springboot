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

    @JsonIgnore
    public Long getIdControl() {
        return idControl;
    }

    @JsonSetter
    public void setIdControl(Long idControl) {
        this.idControl = idControl;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Date getDateControl() {
        return dateControl;
    }

    public void setDateControl(Date dateControl) {
        this.dateControl = dateControl;
    }

    @JsonIgnore
    public Client getClient() {
        return client;
    }
    @JsonSetter
    public void setClient(Client client) {
        this.client = client;
    }
}
