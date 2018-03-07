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

    /**
     * Retrieve the value of Period id.
     * @return A Long data type.
     */
    @JsonIgnore
    public Long getIdPeriod() {
        return idPeriod;
    }
    /**
     * Set the value of Period id.
     * @param idPeriod A variable of type Long.
     */
    @JsonSetter
    public void setIdPeriod(Long idPeriod) {
        this.idPeriod = idPeriod;
    }
    /**
     * Retrieve the value of Period start date.
     * @return A Date data type.
     */
    public Date getStartDate() {
        return startDate;
    }
    /**
     * Set the value of Period start date.
     * @param startDate A variable of type Date.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    /**
     * Retrieve the value of Period end date.
     * @return A Date data type.
     */
    public Date getEndDate() {
        return endDate;
    }
    /**
     * Set the value of Period end date.
     * @param endDate A variable of type Date.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
