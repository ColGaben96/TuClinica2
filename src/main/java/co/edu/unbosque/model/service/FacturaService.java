package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.FacturaDTO;

import java.util.List;

public interface FacturaService {
    List<FacturaDTO> listAll();
    void save(FacturaDTO factura);
    void delete(FacturaDTO factura);
    void find(FacturaDTO factura);
}
