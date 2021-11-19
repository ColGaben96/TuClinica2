package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.EspecieDTO;

public class EspecieDAO {
	private ArrayList<EspecieDTO> especies = new ArrayList<>();

	public EspecieDTO buscarId(int identificacion) {
		for (EspecieDTO encontrado : especies) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarEspecie(int id, String nombre) {
		var especie = new EspecieDTO(id, nombre);
		if (buscarId(id) == null) {
			especies.add(especie);
			return true;
		}
		return false;
	}

	/**
	 * @return the especies
	 */
	public ArrayList<EspecieDTO> getEspecies() {
		return especies;
	}

	/**
	 * @param especies the especies to set
	 */
	public void setEspecies(ArrayList<EspecieDTO> especies) {
		this.especies = especies;
	}
}
