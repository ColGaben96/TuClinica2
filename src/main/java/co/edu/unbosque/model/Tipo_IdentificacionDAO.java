package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.Tipo_IdentificacionDTO;

public class Tipo_IdentificacionDAO {
	private ArrayList<Tipo_IdentificacionDTO> tipos = new ArrayList<>();

	public Tipo_IdentificacionDTO buscarId(int id) {
		for (Tipo_IdentificacionDTO encontrado : tipos) {
			if (encontrado.getId() == id) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarTipo_Identificacion(int id, String nombre) {
		var tipo = new Tipo_IdentificacionDTO(id, nombre);
		if (buscarId(id) == null) {
			tipos.add(tipo);
			return true;
		}
		return false;
	}

	/**
	 * @return the tipos
	 */
	public ArrayList<Tipo_IdentificacionDTO> getTipos() {
		return tipos;
	}

	/**
	 * @param tipos the tipos to set
	 */
	public void setTipos(ArrayList<Tipo_IdentificacionDTO> tipos) {
		this.tipos = tipos;
	}

}
