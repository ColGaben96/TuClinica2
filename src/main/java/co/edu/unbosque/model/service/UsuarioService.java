package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.UsuarioDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioService extends UserDetailsService {
    List<UsuarioDTO> listAll();
    void save(UsuarioDTO usuario);
    void delete(UsuarioDTO usuario);
    UsuarioDTO find(UsuarioDTO usuario);
}
