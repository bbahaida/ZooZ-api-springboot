package com.bahaida.zooz.backend.persistence.repositories;

import com.bahaida.zooz.backend.persistence.domain.Period;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * <b>PeriodRepository is the interface that manages the persistence layer of the Client period Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */

public interface PeriodRepository extends JpaRepository<Period, Long> {
}
