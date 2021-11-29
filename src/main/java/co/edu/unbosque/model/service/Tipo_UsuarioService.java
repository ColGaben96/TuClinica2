package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.Tipo_UsuarioDTO;

import java.util.List;

public interface Tipo_UsuarioService {
    List<Tipo_UsuarioDTO> listAll();
    void save(Tipo_UsuarioDTO tipoUsuario);
    void delete(Tipo_UsuarioDTO tipoUsuario);
    Tipo_UsuarioDTO find(Tipo_UsuarioDTO tipoUsuario);
}
