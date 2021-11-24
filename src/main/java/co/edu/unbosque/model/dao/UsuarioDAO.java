package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.UsuarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<UsuarioDTO, Integer>, JpaRepository<UsuarioDTO, Integer> {
    UsuarioDTO findByCorreo(String correo);
}
