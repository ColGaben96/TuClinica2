package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.Tipo_IdentificacionDTO;

import java.util.List;

public interface Tipo_IdentificacionService {
    List<Tipo_IdentificacionDTO> listAll();
    void save(Tipo_IdentificacionDTO tipoIdentificacion);
    void delete(Tipo_IdentificacionDTO tipoIdentificacion);
    void find(Tipo_IdentificacionDTO tipoIdentificacion);
}
