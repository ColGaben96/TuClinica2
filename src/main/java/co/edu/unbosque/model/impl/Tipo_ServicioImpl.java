package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.Tipo_ServicioDAO;
import co.edu.unbosque.model.persistence.Tipo_ServicioDTO;
import co.edu.unbosque.model.service.Tipo_ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Tipo_ServicioImpl implements Tipo_ServicioService {

    @Autowired
    private Tipo_ServicioDAO tipoSerivico;

    @Override
    @Transactional(readOnly = true)
    public List<Tipo_ServicioDTO> listAll() {
        return (List<Tipo_ServicioDTO>) this.tipoSerivico.findAll();
    }

    @Override
    @Transactional
    public void save(Tipo_ServicioDTO tipoServicio) {
        this.tipoSerivico.save(tipoServicio);
    }

    @Override
    @Transactional
    public void delete(Tipo_ServicioDTO tipoServicio) {
        this.tipoSerivico.delete(tipoServicio);
    }

    @Override
    @Transactional(readOnly = true)
    public void find(Tipo_ServicioDTO tipoServicio) {
        this.tipoSerivico.findById(tipoServicio.getId());
    }
}
