package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.DepartamentoDTO;

import java.util.List;

public interface DepartamentoService {
    List<DepartamentoDTO> listAll();
    void save(DepartamentoDTO departamento);
    void delete(DepartamentoDTO departamento);
    DepartamentoDTO find(DepartamentoDTO departamento);
}
