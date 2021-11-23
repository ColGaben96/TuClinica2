package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.HistoriaDTO;

import java.util.List;

public interface HistoriaService {
    List<HistoriaDTO> listAll();
    void save(HistoriaDTO historia);
    void delete(HistoriaDTO historia);
    void find(HistoriaDTO historia);
}
