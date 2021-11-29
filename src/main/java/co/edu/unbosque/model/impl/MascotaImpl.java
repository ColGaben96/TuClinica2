package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.MascotaDAO;
import co.edu.unbosque.model.persistence.MascotaDTO;
import co.edu.unbosque.model.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MascotaImpl implements MascotaService {

    @Autowired
    private MascotaDAO mascota;

    @Override
    @Transactional(readOnly = true)
    public List<MascotaDTO> listAll() {
        return (List<MascotaDTO>) this.mascota.findAll();
    }

    @Override
    @Transactional
    public void save(MascotaDTO mascota) {
        this.mascota.save(mascota);
    }

    @Override
    @Transactional
    public void delete(MascotaDTO mascota) {
        this.mascota.delete(mascota);
    }

    @Override
    @Transactional(readOnly = true)
    public MascotaDTO find(MascotaDTO mascota) {
        return this.mascota.findById(mascota.getId()).orElse(null);
    }
}
