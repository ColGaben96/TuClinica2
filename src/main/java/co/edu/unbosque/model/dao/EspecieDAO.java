package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.EspecieDTO;
import org.springframework.data.repository.CrudRepository;

public interface EspecieDAO extends CrudRepository<EspecieDTO, Integer> {
}
