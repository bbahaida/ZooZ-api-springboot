package com.bahaida.zooz.backend.persistence.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Period implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPeriod;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    public Period() {
    }

    public Period(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @JsonIgnore
    public Long getIdPeriod() {
        return idPeriod;
    }
    @JsonSetter
    public void setIdPeriod(Long idPeriod) {
        this.idPeriod = idPeriod;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
