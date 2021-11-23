package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.UsuarioDAO;
import co.edu.unbosque.model.persistence.UsuarioDTO;
import co.edu.unbosque.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Usuario_Impl implements UsuarioService {

    @Autowired
    private UsuarioDAO usuario;

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioDTO> listAll() {
        return (List<UsuarioDTO>) this.usuario.findAll();
    }

    @Override
    @Transactional
    public void save(UsuarioDTO usuario) {
        this.usuario.save(usuario);
    }

    @Override
    @Transactional
    public void delete(UsuarioDTO usuario) {
        this.usuario.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public void find(UsuarioDTO usuario) {
        this.usuario.findById(usuario.getId());
    }
}
