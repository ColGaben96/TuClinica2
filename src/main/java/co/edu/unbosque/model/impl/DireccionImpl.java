package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.DireccionDAO;
import co.edu.unbosque.model.persistence.DireccionDTO;
import co.edu.unbosque.model.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DireccionImpl implements DireccionService {

    @Autowired
    private DireccionDAO direccion;

    @Override
    @Transactional(readOnly = true)
    public List<DireccionDTO> listAll() {
        return (List<DireccionDTO>) this.direccion.findAll();
    }

    @Override
    @Transactional
    public void save(DireccionDTO direccion) {
        this.direccion.save(direccion);
    }

    @Override
    @Transactional
    public void delete(DireccionDTO direccion) {
        this.direccion.delete(direccion);
    }

    @Override
    @Transactional(readOnly = true)
    public DireccionDTO find(DireccionDTO direccion) {
        return this.direccion.findById(direccion.getId()).orElse(null);
    }
}
