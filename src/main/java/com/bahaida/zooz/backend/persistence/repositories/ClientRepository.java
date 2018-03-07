package com.bahaida.zooz.backend.persistence.repositories;

import com.bahaida.zooz.backend.persistence.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * <b>ClientRepository is the interface that manages the persistence layer of the Client Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */

public interface ClientRepository extends JpaRepository<Client,Long> {

    @Query("select c from Client c where c.login = ?1 and c.password = ?2")
    Client login(String login, String password);
}
