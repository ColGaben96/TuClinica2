package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.MascotaDTO;

import java.util.List;

public interface MascotaService {
    List<MascotaDTO> listAll();
    void save(MascotaDTO mascota);
    void delete(MascotaDTO mascota);
    void find(MascotaDTO mascota);
}
