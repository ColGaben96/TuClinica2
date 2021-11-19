package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.SuministroDTO;
import co.edu.unbosque.model.persistence.Tipo_SuministroDTO;

public class SuministroDAO {
	private ArrayList<SuministroDTO> suministros = new ArrayList<>();

	public SuministroDTO buscarId(int identificacion) {
		for (SuministroDTO encontrado : suministros) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarSuministro(int id, String nombre, String via_administracion, String fabricante, int precio,
			Tipo_SuministroDTO tipo_suministro) {
		var suministro = new SuministroDTO(id, nombre, via_administracion, fabricante, precio, tipo_suministro);
		if (buscarId(id) == null) {
			suministros.add(suministro);
			return true;
		}
		return false;
	}

	public void actualizarSuministro(SuministroDTO suministro, int id, String nombre, String via_administracion,
			String fabricante, int precio, Tipo_SuministroDTO tipo_suministro) {
		suministro.setId(id);
		suministro.setNombre(nombre);
		suministro.setVia_administracion(via_administracion);
		suministro.setFabricante(fabricante);
		suministro.setPrecio(precio);
		suministro.setTipo_suministro(tipo_suministro);

	}

	/**
	 * @return the suministros
	 */
	public ArrayList<SuministroDTO> getSuministros() {
		return suministros;
	}

	/**
	 * @param suministros the suministros to set
	 */
	public void setSuministros(ArrayList<SuministroDTO> suministros) {
		this.suministros = suministros;
	}
}
