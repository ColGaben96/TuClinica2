package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.Tipo_UsuarioDAO;
import co.edu.unbosque.model.persistence.Tipo_UsuarioDTO;
import co.edu.unbosque.model.service.Tipo_UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Tipo_UsuarioImpl implements Tipo_UsuarioService {

    @Autowired
    private Tipo_UsuarioDAO tipoUsuario;

    @Override
    @Transactional(readOnly = true)
    public List<Tipo_UsuarioDTO> listAll() {
        return (List<Tipo_UsuarioDTO>) this.tipoUsuario.findAll();
    }

    @Override
    @Transactional
    public void save(Tipo_UsuarioDTO tipoUsuario) {
        this.tipoUsuario.save(tipoUsuario);
    }

    @Override
    @Transactional
    public void delete(Tipo_UsuarioDTO tipoUsuario) {
        this.tipoUsuario.delete(tipoUsuario);
    }

    @Override
    @Transactional(readOnly = true)
    public void find(Tipo_UsuarioDTO tipoUsuario) {
        this.tipoUsuario.findById(tipoUsuario.getId());
    }
}
