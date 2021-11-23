package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.MascotaDTO;
import org.springframework.data.repository.CrudRepository;

public interface MascotaDAO extends CrudRepository<MascotaDTO, Integer> {
}
