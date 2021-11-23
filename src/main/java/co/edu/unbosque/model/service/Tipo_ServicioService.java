package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.Tipo_ServicioDTO;

import java.util.List;

public interface Tipo_ServicioService {
    List<Tipo_ServicioDTO> listAll();
    void save(Tipo_ServicioDTO tipoServicio);
    void delete(Tipo_ServicioDTO tipoServicio);
    void find(Tipo_ServicioDTO tipoServicio);
}
