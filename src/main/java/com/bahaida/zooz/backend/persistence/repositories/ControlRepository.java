package com.bahaida.zooz.backend.persistence.repositories;

import com.bahaida.zooz.backend.persistence.domain.Control;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ControlRepository extends JpaRepository<Control, Long> {
}
