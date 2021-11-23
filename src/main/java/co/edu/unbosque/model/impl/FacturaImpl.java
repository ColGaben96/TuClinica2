package co.edu.unbosque.model.impl;

import co.edu.unbosque.model.dao.FacturaDAO;
import co.edu.unbosque.model.persistence.FacturaDTO;
import co.edu.unbosque.model.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class FacturaImpl implements FacturaService {

    @Autowired
    private FacturaDAO factura;

    @Override
    @Transactional(readOnly = true)
    public List<FacturaDTO> listAll() {
        return (List<FacturaDTO>) this.factura.findAll();
    }

    @Override
    @Transactional
    public void save(FacturaDTO factura) {
        this.factura.save(factura);
    }

    @Override
    @Transactional
    public void delete(FacturaDTO factura) {
        this.factura.delete(factura);
    }

    @Override
    @Transactional(readOnly = true)
    public void find(FacturaDTO factura) {
        this.factura.findById(factura.getId());
    }
}
