package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.EspecieDAO;
import co.edu.unbosque.model.persistence.EspecieDTO;
import co.edu.unbosque.model.service.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EspecieImpl implements EspecieService {

    @Autowired
    private EspecieDAO especie;

    @Override
    @Transactional(readOnly = true)
    public List<EspecieDTO> listAll() {
        return (List<EspecieDTO>) this.especie.findAll();
    }

    @Override
    @Transactional
    public void save(EspecieDTO especie) {
        this.especie.save(especie);
    }

    @Override
    @Transactional
    public void delete(EspecieDTO especie) {
        this.especie.delete(especie);
    }

    @Override
    @Transactional(readOnly = true)
    public void find(EspecieDTO especie) {
        this.especie.findById(especie.getId());
    }
}
