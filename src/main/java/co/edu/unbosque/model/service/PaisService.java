package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.PaisDTO;

import java.util.List;

public interface PaisService {
    List<PaisDTO> listAll();
    void save(PaisDTO pais);
    void delete(PaisDTO pais);
    void find(PaisDTO pais);
}
