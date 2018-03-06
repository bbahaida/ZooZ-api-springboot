package com.bahaida.zooz.backend.services;


import com.bahaida.zooz.backend.persistence.domain.Period;

import java.util.List;

public interface IPeriodService {
    Period save(Period period);

    List<Period> findAll();

    Period findById(Long id);

    void update(Period period);

    void delete(Long id);
}
