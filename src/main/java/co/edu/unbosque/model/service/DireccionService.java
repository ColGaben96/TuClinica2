package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.DireccionDTO;

import java.util.List;

public interface DireccionService {
    List<DireccionDTO> listAll();
    void save(DireccionDTO direccion);
    void delete(DireccionDTO direccion);
    void find(DireccionDTO direccion);
}
