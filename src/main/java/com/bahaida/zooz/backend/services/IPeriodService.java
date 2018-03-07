package com.bahaida.zooz.backend.services;


import com.bahaida.zooz.backend.persistence.domain.Period;

import java.util.List;

/**
 *
 * <b>IPeriodService is the interface that manages the business layer of the Client period Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */
public interface IPeriodService {
    Period save(Period period);

    List<Period> findAll();

    Period findById(Long id);

    Period update(Long id, Period period);

    void delete(Long id);
}
