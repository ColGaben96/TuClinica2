package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.PaisDAO;
import co.edu.unbosque.model.persistence.PaisDTO;
import co.edu.unbosque.model.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisImpl implements PaisService {

    @Autowired
    private PaisDAO pais;


    @Override
    public List<PaisDTO> listAll() {
        return (List<PaisDTO>) this.pais.findAll();
    }

    @Override
    public void save(PaisDTO pais) {
        this.pais.save(pais);
    }

    @Override
    public void delete(PaisDTO pais) {
        this.pais.delete(pais);
    }

    @Override
    public void find(PaisDTO pais) {
        this.pais.findById(pais.getId());
    }
}
