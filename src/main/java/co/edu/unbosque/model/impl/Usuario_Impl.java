package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.UsuarioDAO;
import co.edu.unbosque.model.persistence.Tipo_UsuarioDTO;
import co.edu.unbosque.model.persistence.UsuarioDTO;
import co.edu.unbosque.model.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsService")
@Slf4j
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

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var usuario = this.usuario.findByCorreo(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("El usuario no se encuentra");
        }
        var roles = new ArrayList<GrantedAuthority>();
        var rolesActuales = new Tipo_UsuarioImpl().listAll();
        for (Tipo_UsuarioDTO rol : rolesActuales) {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        return new User(usuario.getCorreo(), usuario.getContrasena(), roles);
    }
}
