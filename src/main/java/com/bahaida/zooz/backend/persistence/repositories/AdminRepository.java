package com.bahaida.zooz.backend.persistence.repositories;

import com.bahaida.zooz.backend.persistence.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 *
 * <b>AdminRepository is the interface that manages the persistence layer of the Admin Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */
public interface AdminRepository extends JpaRepository<Admin,Long> {
    @Query("select a from Admin a where a.login = ?1 and a.password = ?2")
    Admin login(String login, String password);
}
