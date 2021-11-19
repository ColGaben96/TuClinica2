package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.PaisDTO;

public class PaisDAO {
	private ArrayList<PaisDTO> paises = new ArrayList<>();

	public PaisDTO buscarId(int identificacion) {
		for (PaisDTO encontrado : paises) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarPais(int id, String nombre) {
		var especie = new PaisDTO(id, nombre);
		if (buscarId(id) == null) {
			paises.add(especie);
			return true;
		}
		return false;
	}

	/**
	 * @return the paises
	 */
	public ArrayList<PaisDTO> getPaises() {
		return paises;
	}

	/**
	 * @param paises the paises to set
	 */
	public void setPaises(ArrayList<PaisDTO> paises) {
		this.paises = paises;
	}

}
