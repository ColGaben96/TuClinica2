package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.RazaDTO;

import java.util.List;

public interface RazaService {
    List<RazaDTO> listAll();
    void save(RazaDTO raza);
    void delete(RazaDTO raza);
    RazaDTO find(RazaDTO raza);
}
