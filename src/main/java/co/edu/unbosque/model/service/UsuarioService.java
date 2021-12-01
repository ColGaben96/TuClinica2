package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> listAll();
    void save(UsuarioDTO usuario);
    void delete(UsuarioDTO usuario);
    UsuarioDTO find(int userID);
    UsuarioDTO findByEmail(String email, String password);
}
