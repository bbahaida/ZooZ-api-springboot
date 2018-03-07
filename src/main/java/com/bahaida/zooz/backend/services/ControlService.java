package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Control;
import com.bahaida.zooz.backend.persistence.repositories.ControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControlService implements IControlService{

    @Autowired
    private ControlRepository controlRepository;

    @Override
    public Control save(Control control) {
        return controlRepository.save(control);
    }

    @Override
    public List<Control> findAll() {
        return controlRepository.findAll();
    }

    @Override
    public Control findById(Long id) {
        return controlRepository.getOne(id);
    }

    @Override
    public Control update(Long id, Control control) {
        return controlRepository.save(control);
    }

    @Override
    public void delete(Long id) {
        controlRepository.deleteById(id);
    }
}
