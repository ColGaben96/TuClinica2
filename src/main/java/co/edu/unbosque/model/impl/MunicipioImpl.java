package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.MunicipioDAO;
import co.edu.unbosque.model.persistence.DepartamentoDTO;
import co.edu.unbosque.model.persistence.MunicipioDTO;
import co.edu.unbosque.model.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MunicipioImpl implements MunicipioService {

    @Autowired
    private MunicipioDAO municipio;

    @Override
    @Transactional(readOnly = true)
    public List<MunicipioDTO> listAll() {
        return (List<MunicipioDTO>) municipio.findAll();
    }

    @Override
    @Transactional
    public void save(MunicipioDTO municipio) {
        this.municipio.save(municipio);
    }

    @Override
    @Transactional
    public void delete(MunicipioDTO municipio) {
        this.municipio.delete(municipio);
    }

    @Override
    @Transactional(readOnly = true)
    public MunicipioDTO find(MunicipioDTO municipio) {
        return this.municipio.findById(municipio.getId()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public MunicipioDTO findByMunicipID(int municipID) {
        return this.municipio.findById(municipID).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public MunicipioDTO findByDepto(MunicipioDTO municipioDTO) {
        var deptos = new DepartamentoImpl().listAll();
        for (DepartamentoDTO d : deptos) {
            if (d.getId() == municipioDTO.getDepartamento().getId()) {
                return find(municipioDTO);
            }
        }
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<MunicipioDTO> listByDepto(DepartamentoDTO municipioDTO) {
        var municipios = new ArrayList<MunicipioDTO>();
        var munps = listAll();
        for (MunicipioDTO m : munps) {
            if (m.getDepartamento() == municipioDTO) {
                municipios.add(m);
            }
        }
        return municipios;
    }


}
