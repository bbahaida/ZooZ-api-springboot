package com.bahaida.zooz.backend.persistence.repositories;

import com.bahaida.zooz.backend.persistence.domain.Hammam;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * <b>HammamRepository is the interface that manages the persistence layer of the Hammam Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */
public interface HammamRepository extends JpaRepository<Hammam,Long> {
}
