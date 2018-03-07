package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Control;
import com.bahaida.zooz.backend.persistence.repositories.ControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * <b>ControlService is the implementation of IControlService interface that manages the business layer of the Client control Services</b>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-06
 */
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
        Control c = controlRepository.getOne(id);
        c.setDateControl(control.getDateControl() == null ? c.getDateControl() : control.getDateControl());
        c.setResult(control.isResult());
        return controlRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        controlRepository.deleteById(id);
    }
}
