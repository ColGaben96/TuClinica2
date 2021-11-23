package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.DepartamentoDAO;
import co.edu.unbosque.model.persistence.DepartamentoDTO;
import co.edu.unbosque.model.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class DepartamentoImpl implements DepartamentoService {

    @Autowired
    private DepartamentoDAO departamento;

    @Override
    @Transactional(readOnly = true)
    public List<DepartamentoDTO> listAll() {
        return (List<DepartamentoDTO>) this.departamento.findAll();
    }

    @Override
    @Transactional
    public void save(DepartamentoDTO departamento) {
        this.departamento.save(departamento);
    }

    @Override
    @Transactional
    public void delete(DepartamentoDTO departamento) {
        this.departamento.delete(departamento);
    }

    @Override
    @Transactional(readOnly = true)
    public void find(DepartamentoDTO departamento) {
        this.departamento.findById(departamento.getId());
    }
}
