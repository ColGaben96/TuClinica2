package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.Historia_SuministroDTO;

import java.util.List;

public interface Historia_SuministroService {
    List<Historia_SuministroDTO> listAll();
    void save(Historia_SuministroDTO historia_suministro);
    void delete(Historia_SuministroDTO historia_suministro);
    Historia_SuministroDTO find(Historia_SuministroDTO historia_suministro);
}
