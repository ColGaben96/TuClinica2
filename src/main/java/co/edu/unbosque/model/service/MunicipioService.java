package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.DepartamentoDTO;
import co.edu.unbosque.model.persistence.MunicipioDTO;

import java.util.List;

public interface MunicipioService {
    List<MunicipioDTO> listAll();
    void save(MunicipioDTO municipio);
    void delete(MunicipioDTO municipio);
    MunicipioDTO find(MunicipioDTO municipio);
    MunicipioDTO findByMunicipID(int municipID);
    MunicipioDTO findByDepto(MunicipioDTO departamento);
    List<MunicipioDTO> listByDepto(DepartamentoDTO departamentoDTO);
}
