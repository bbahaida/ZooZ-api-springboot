package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Period;
import com.bahaida.zooz.backend.persistence.repositories.PeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void update(Period period) {
        periodRepository.save(period);
    }

    @Override
    public void delete(Long id) {
        periodRepository.deleteById(id);
    }
}
