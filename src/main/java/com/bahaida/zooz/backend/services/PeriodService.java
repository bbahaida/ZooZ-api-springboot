package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Period;
import com.bahaida.zooz.backend.persistence.repositories.PeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * <b>PeriodService is the implementation of IPeriodService interface that manages the business layer of the Client period Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */

@Service
public class PeriodService implements IPeriodService {

    @Autowired
    private PeriodRepository periodRepository;

    @Override
    public Period save(Period period) {
        if (!period.getClient().isMenopause())
            return periodRepository.save(period);
        return null;
    }

    @Override
    public List<Period> findAll() {
        return periodRepository.findAll();
    }

    @Override
    public Period findById(Long id) {
        return periodRepository.getOne(id);
    }

    @Override
    public Period update(Long id, Period period) {
        Period p = periodRepository.getOne(id);
        p.setStartDate(period.getStartDate() == null ? p.getStartDate() : period.getStartDate());
        p.setEndDate(period.getEndDate() == null ? p.getEndDate() : period.getEndDate());
        return periodRepository.save(p);
    }

    @Override
    public void delete(Long id) {
        periodRepository.deleteById(id);
    }
}
