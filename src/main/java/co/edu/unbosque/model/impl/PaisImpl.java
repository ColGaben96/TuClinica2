package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.PaisDAO;
import co.edu.unbosque.model.persistence.PaisDTO;
import co.edu.unbosque.model.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaisImpl implements PaisService {

    @Autowired
    private PaisDAO pais;


    @Override
    @Transactional(readOnly = true)
    public List<PaisDTO> listAll() {
        return (List<PaisDTO>) this.pais.findAll();
    }

    @Override
    @Transactional
    public void save(PaisDTO pais) {
        this.pais.save(pais);
    }

    @Override
    @Transactional
    public void delete(PaisDTO pais) {
        this.pais.delete(pais);
    }

    @Override
    @Transactional(readOnly = true)
    public PaisDTO find(PaisDTO pais) {
        return this.pais.findById(pais.getId()).orElse(null);
    }
}
