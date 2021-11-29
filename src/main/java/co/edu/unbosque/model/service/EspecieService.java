package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.EspecieDTO;

import java.util.List;

public interface EspecieService {
    List<EspecieDTO> listAll();
    void save(EspecieDTO especie);
    void delete(EspecieDTO especie);
    EspecieDTO find(EspecieDTO especie);
}
