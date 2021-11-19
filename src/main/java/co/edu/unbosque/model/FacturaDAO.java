package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.*;

public class FacturaDAO {
	private ArrayList<FacturaDTO> facturas = new ArrayList<>();

	public FacturaDTO buscarId(int identificacion) {
		for (FacturaDTO encontrado : facturas) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarFactura(int id, UsuarioDTO dueno, UsuarioDTO veterinario, String fecha_servicio,
			Tipo_ServicioDTO tipo_servicio, int total_servicio, boolean estado) {
		var factura = new FacturaDTO(id, dueno, veterinario, fecha_servicio, tipo_servicio, total_servicio, estado);
		if (buscarId(id) == null) {
			facturas.add(factura);
			return true;
		}
		return false;
	}

	public boolean desactivarFactura(FacturaDTO factura, int id) {
		if (buscarId(id) == null) {
			return false;
		} else {
			factura.setEstado(false);
			return true;
		}
	}

	public void actualizarFactura(FacturaDTO factura, int id, UsuarioDTO dueno, UsuarioDTO veterinario,
			String fecha_servicio, Tipo_ServicioDTO tipo_servicio, int total_servicio, boolean estado) {

		factura.setId(id);
		factura.setDueno(dueno);
		factura.setVeterinario(veterinario);
		factura.setFecha_servicio(fecha_servicio);
		factura.setTipo_servicio(tipo_servicio);
		factura.setTotal_servicio(total_servicio);
		factura.setEstado(estado);
	}

	/**
	 * @return the facturas
	 */
	public ArrayList<FacturaDTO> getFacturas() {
		return facturas;
	}

	/**
	 * @param facturas the facturas to set
	 */
	public void setFacturas(ArrayList<FacturaDTO> facturas) {
		this.facturas = facturas;
	}

}
