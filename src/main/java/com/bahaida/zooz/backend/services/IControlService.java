package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Control;

import java.util.List;

/**
 *
 * <b>IControlService is the interface that manages the business layer of the Client control Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */
public interface IControlService {
    Control save(Control control);

    List<Control> findAll();

    Control findById(Long id);

    Control update(Long id,Control control);

    void delete(Long id);
}
