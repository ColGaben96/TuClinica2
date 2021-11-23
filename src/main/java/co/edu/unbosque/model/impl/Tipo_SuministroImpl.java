package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.Tipo_SuministroDAO;
import co.edu.unbosque.model.persistence.Tipo_SuministroDTO;
import co.edu.unbosque.model.service.Tipo_SuministroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Tipo_SuministroImpl implements Tipo_SuministroService {

    @Autowired
    private Tipo_SuministroDAO tipoSuministro;

    @Override
    @Transactional(readOnly = true)
    public List<Tipo_SuministroDTO> listAll() {
        return (List<Tipo_SuministroDTO>) this.tipoSuministro.findAll();
    }

    @Override
    @Transactional
    public void save(Tipo_SuministroDTO tipoSuministro) {
        this.tipoSuministro.save(tipoSuministro);
    }

    @Override
    @Transactional
    public void delete(Tipo_SuministroDTO tipoSuministro) {
        this.tipoSuministro.delete(tipoSuministro);
    }

    @Override
    @Transactional(readOnly = true)
    public void find(Tipo_SuministroDTO tipoSuministro) {

    }
}
