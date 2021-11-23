package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.SuministroDAO;
import co.edu.unbosque.model.persistence.SuministroDTO;
import co.edu.unbosque.model.service.SuministroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SuministroImpl implements SuministroService {

    @Autowired
    private SuministroDAO suministro;

    @Override
    @Transactional(readOnly = true)
    public List<SuministroDTO> listAll() {
        return (List<SuministroDTO>) this.suministro.findAll();
    }

    @Override
    @Transactional
    public void save(SuministroDTO suministro) {
        this.suministro.save(suministro);
    }

    @Override
    @Transactional
    public void delete(SuministroDTO suministro) {
        this.suministro.delete(suministro);
    }

    @Override
    @Transactional(readOnly = true)
    public void find(SuministroDTO suministro) {
        this.suministro.findById(suministro.getId());
    }
}
