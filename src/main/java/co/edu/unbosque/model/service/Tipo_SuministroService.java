package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.Tipo_SuministroDTO;

import java.util.List;

public interface Tipo_SuministroService {
    List<Tipo_SuministroDTO> listAll();
    void save(Tipo_SuministroDTO tipoSuministro);
    void delete(Tipo_SuministroDTO tipoSuministro);
    void find(Tipo_SuministroDTO tipoSuministro);
}
