package com.bahaida.zooz.backend.services;


import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.persistence.domain.Hammam;

import java.util.List;

public interface IHammamService {
    Hammam save(Hammam hammam);
    List<Hammam> findAll();
    Hammam findById(Long id);

    void update(Hammam hammam);

    void delete(Long id);
}
