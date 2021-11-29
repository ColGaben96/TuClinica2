package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.DepartamentoDAO;
import co.edu.unbosque.model.dao.MunicipioDAO;
import co.edu.unbosque.model.persistence.DepartamentoDTO;
import co.edu.unbosque.model.persistence.MunicipioDTO;
import co.edu.unbosque.model.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MunicipioImpl implements MunicipioService {

    @Autowired
    private MunicipioDAO municipio;

    @Override
    @Transactional(readOnly = true)
    public List<MunicipioDTO> listAll() {
        return (List<MunicipioDTO>) municipio.findAll();
    }

    @Override
    @Transactional
    public void save(MunicipioDTO municipio) {
        this.municipio.save(municipio);
    }

    @Override
    @Transactional
    public void delete(MunicipioDTO municipio) {
        this.municipio.delete(municipio);
    }

    @Override
    @Transactional(readOnly = true)
    public MunicipioDTO find(MunicipioDTO municipio) {
        return this.municipio.findById(municipio.getId()).orElse(null);
    }

}
