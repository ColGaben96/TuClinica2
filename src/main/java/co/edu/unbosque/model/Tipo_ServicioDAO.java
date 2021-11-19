package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.Tipo_ServicioDTO;

public class Tipo_ServicioDAO {

	private ArrayList<Tipo_ServicioDTO> tipos = new ArrayList<>();

	public Tipo_ServicioDTO buscarId(int id) {
		for (Tipo_ServicioDTO encontrado : tipos) {
			if (encontrado.getId() == id) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarTipo_Servicio(int id, String nombre, int tarifa) {
		var tipo = new Tipo_ServicioDTO(id, nombre, tarifa);
		if (buscarId(id) == null) {
			tipos.add(tipo);
			return true;
		}
		return false;
	}

	/**
	 * @return the tipos
	 */
	public ArrayList<Tipo_ServicioDTO> getTipos() {
		return tipos;
	}

	/**
	 * @param tipos the tipos to set
	 */
	public void setTipos(ArrayList<Tipo_ServicioDTO> tipos) {
		this.tipos = tipos;
	}

}
