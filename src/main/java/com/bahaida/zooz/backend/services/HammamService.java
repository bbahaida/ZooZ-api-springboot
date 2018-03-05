package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Hammam;
import com.bahaida.zooz.backend.persistence.repositories.HammamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void update(Hammam hammam) {
        hammamRepository.save(hammam);
    }

    @Override
    public void delete(Long id) {
        hammamRepository.deleteById(id);
    }
}
