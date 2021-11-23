package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.DepartamentoDTO;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoDAO extends CrudRepository<DepartamentoDTO, Integer> {

}
