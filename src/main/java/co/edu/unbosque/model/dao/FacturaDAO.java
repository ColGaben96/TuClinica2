package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.FacturaDTO;
import org.springframework.data.repository.CrudRepository;

public interface FacturaDAO extends CrudRepository<FacturaDTO, Integer> {
}
