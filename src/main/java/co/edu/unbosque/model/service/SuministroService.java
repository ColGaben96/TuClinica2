package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.SuministroDTO;

import java.util.List;

public interface SuministroService {
    List<SuministroDTO> listAll();
    void save(SuministroDTO suministro);
    void delete(SuministroDTO suministro);
    SuministroDTO find(SuministroDTO suministro);
}
