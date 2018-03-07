package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Hammam;
import com.bahaida.zooz.backend.persistence.repositories.HammamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * <b>HammamService is the implementation of IHammamService interface that manages the business layer of the Hammam Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */

@Service
public class HammamService implements IHammamService{

    @Autowired
    private HammamRepository hammamRepository;
    @Override
    public Hammam save(Hammam hammam) {
        return hammamRepository.save(hammam);
    }

    @Override
    public List<Hammam> findAll() {
        return hammamRepository.findAll();
    }

    @Override
    public Hammam findById(Long id) {
        return hammamRepository.getOne(id);
    }

    @Override
    public Hammam update(Long id, Hammam hammam) {
        Hammam h = hammamRepository.getOne(id);
        h.setName(hammam.getName() == null ? h.getName() : hammam.getName());
        return hammamRepository.save(h);
    }

    @Override
    public void delete(Long id) {
        hammamRepository.deleteById(id);
    }
}
