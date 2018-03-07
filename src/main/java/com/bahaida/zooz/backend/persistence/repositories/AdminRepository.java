package com.bahaida.zooz.backend.persistence.repositories;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
