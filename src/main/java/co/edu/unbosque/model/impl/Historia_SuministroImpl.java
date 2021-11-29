package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.Historia_SuministroDAO;
import co.edu.unbosque.model.persistence.Historia_SuministroDTO;
import co.edu.unbosque.model.service.Historia_SuministroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Historia_SuministroImpl implements Historia_SuministroService {

    @Autowired
    private Historia_SuministroDAO historia_suministro;

    @Override
    @Transactional(readOnly = true)
    public List<Historia_SuministroDTO> listAll() {
        return (List<Historia_SuministroDTO>) this.historia_suministro.findAll();
    }

    @Override
    @Transactional
    public void save(Historia_SuministroDTO historia_suministro) {
        this.historia_suministro.save(historia_suministro);
    }

    @Override
    @Transactional
    public void delete(Historia_SuministroDTO historia_suministro) {
        this.historia_suministro.delete(historia_suministro);
    }

    @Override
    @Transactional(readOnly = true)
    public Historia_SuministroDTO find(Historia_SuministroDTO historia_suministro) {
        return this.historia_suministro.findById(historia_suministro.getId()).orElse(null);
    }
}
