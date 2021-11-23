package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.HistoriaDTO;
import org.springframework.data.repository.CrudRepository;

public interface HistoriaDAO extends CrudRepository<HistoriaDTO, Integer> {
}
