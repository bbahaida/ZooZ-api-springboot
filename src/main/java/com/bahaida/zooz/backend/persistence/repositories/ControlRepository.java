package com.bahaida.zooz.backend.persistence.repositories;

import com.bahaida.zooz.backend.persistence.domain.Control;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * <b>ControlRepository is the interface that manages the persistence layer of the Client control Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */
public interface ControlRepository extends JpaRepository<Control, Long> {
}
