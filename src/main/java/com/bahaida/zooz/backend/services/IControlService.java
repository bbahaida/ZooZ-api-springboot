package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Control;

import java.util.List;

public interface IControlService {
    Control save(Control control);

    List<Control> findAll();

    Control findById(Long id);

    Control update(Long id,Control control);

    void delete(Long id);
}
