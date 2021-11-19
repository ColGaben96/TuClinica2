package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.Tipo_SuministroDTO;

public class Tipo_SumuinistroDAO {
	private ArrayList<Tipo_SuministroDTO> tipos = new ArrayList<>();

	public Tipo_SuministroDTO buscarId(int id) {
		for (Tipo_SuministroDTO encontrado : tipos) {
			if (encontrado.getId() == id) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarTipo_Suministro(int id, String nombre) {
		var tipo = new Tipo_SuministroDTO(id, nombre);
		if (buscarId(id) == null) {
			tipos.add(tipo);
			return true;
		}
		return false;
	}

	/**
	 * @return the tipos
	 */
	public ArrayList<Tipo_SuministroDTO> getTipos() {
		return tipos;
	}

	/**
	 * @param tipos the tipos to set
	 */
	public void setTipos(ArrayList<Tipo_SuministroDTO> tipos) {
		this.tipos = tipos;
	}
	
}