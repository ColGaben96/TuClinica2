package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.MunicipioDTO;
import org.springframework.data.repository.CrudRepository;

public interface MunicipioDAO extends CrudRepository<MunicipioDTO, Integer> {
}
