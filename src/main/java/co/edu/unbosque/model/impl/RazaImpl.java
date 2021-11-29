package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.RazaDAO;
import co.edu.unbosque.model.persistence.RazaDTO;
import co.edu.unbosque.model.service.RazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RazaImpl implements RazaService {

    @Autowired
    private RazaDAO raza;

    @Override
    @Transactional(readOnly = true)
    public List<RazaDTO> listAll() {
        return (List<RazaDTO>) this.raza.findAll();
    }

    @Override
    @Transactional
    public void save(RazaDTO raza) {
        this.raza.save(raza);
    }

    @Override
    @Transactional
    public void delete(RazaDTO raza) {
        this.raza.delete(raza);
    }

    @Override
    @Transactional(readOnly = true)
    public RazaDTO find(RazaDTO raza) {
        return this.raza.findById(raza.getId()).orElse(null);
    }
}
