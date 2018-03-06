package com.bahaida.zooz.backend.persistence.repositories;

import com.bahaida.zooz.backend.persistence.domain.Period;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodRepository extends JpaRepository<Period, Long> {
}
