package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.PaisDTO;
import org.springframework.data.repository.CrudRepository;

public interface PaisDAO extends CrudRepository<PaisDTO, Integer> {
}
