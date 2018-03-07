package com.bahaida.zooz.backend.services;


import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.persistence.domain.Hammam;

import java.util.List;

/**
 *
 * <b>IHammamService is the interface that manages the business layer of the Hammam Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */
public interface IHammamService {
    Hammam save(Hammam hammam);
    List<Hammam> findAll();
    Hammam findById(Long id);

    Hammam update(Long id, Hammam hammam);

    void delete(Long id);
}
