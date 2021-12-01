package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.DepartamentoDAO;
import co.edu.unbosque.model.persistence.DepartamentoDTO;
import co.edu.unbosque.model.persistence.PaisDTO;
import co.edu.unbosque.model.service.DepartamentoService;
import co.edu.unbosque.model.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
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
    public DepartamentoDTO find(DepartamentoDTO departamento) {
        return this.departamento.findById(departamento.getId()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public DepartamentoDTO findByCountry(DepartamentoDTO departamentoDTO) {
        var paises = new PaisImpl().listAll();
        for (PaisDTO p : paises) {
            if (p.getId() == departamentoDTO.getId_pais().getId()) {
                return find(departamentoDTO);
            }
        }
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<DepartamentoDTO> listByCountry(PaisDTO pais) {
        var deptos = new ArrayList<DepartamentoDTO>();
        var deps = listAll();
        for (DepartamentoDTO d : deps) {
            if (d.getId_pais() == pais) {
                deptos.add(d);
            }
        }

        return deptos;
    }
}
