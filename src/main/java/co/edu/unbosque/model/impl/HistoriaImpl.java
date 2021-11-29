package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.HistoriaDAO;
import co.edu.unbosque.model.persistence.HistoriaDTO;
import co.edu.unbosque.model.service.HistoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HistoriaImpl implements HistoriaService {

    @Autowired
    private HistoriaDAO historia;

    @Override
    @Transactional(readOnly = true)
    public List<HistoriaDTO> listAll() {
        return (List<HistoriaDTO>) this.historia.findAll();
    }

    @Override
    @Transactional
    public void save(HistoriaDTO historia) {
        this.historia.save(historia);
    }

    @Override
    @Transactional
    public void delete(HistoriaDTO historia) {
        this.historia.delete(historia);
    }

    @Override
    @Transactional(readOnly = true)
    public HistoriaDTO find(HistoriaDTO historia) {
        return this.historia.findById(historia.getId()).orElse(null);
    }
}
