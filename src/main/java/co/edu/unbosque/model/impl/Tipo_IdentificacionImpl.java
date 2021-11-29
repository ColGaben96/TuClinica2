package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.Tipo_IdentificacionDAO;
import co.edu.unbosque.model.persistence.Tipo_IdentificacionDTO;
import co.edu.unbosque.model.service.Tipo_IdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Tipo_IdentificacionImpl implements Tipo_IdentificacionService {

    @Autowired
    private Tipo_IdentificacionDAO tipoIdentificacion;

    @Override
    @Transactional(readOnly = true)
    public List<Tipo_IdentificacionDTO> listAll() {
        return (List<Tipo_IdentificacionDTO>) this.tipoIdentificacion.findAll();
    }

    @Override
    @Transactional
    public void save(Tipo_IdentificacionDTO tipoIdentificacion) {
        this.tipoIdentificacion.save(tipoIdentificacion);
    }

    @Override
    @Transactional
    public void delete(Tipo_IdentificacionDTO tipoIdentificacion) {
        this.tipoIdentificacion.delete(tipoIdentificacion);
    }

    @Override
    @Transactional(readOnly = true)
    public Tipo_IdentificacionDTO find(Tipo_IdentificacionDTO tipoIdentificacion) {
        return this.tipoIdentificacion.findById(tipoIdentificacion.getId()).orElse(null);
    }
}
