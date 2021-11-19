package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.EspecieDTO;
import co.edu.unbosque.model.persistence.RazaDTO;

public class RazaDAO {
	private ArrayList<RazaDTO> razas = new ArrayList<>();

	public RazaDTO buscarId(int identificacion) {
		for (RazaDTO encontrado : razas) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarRaza(int id, String nombre, EspecieDTO especie) {
		var raza = new RazaDTO(id, nombre, especie);
		if (buscarId(id) == null) {
			razas.add(raza);
			return true;
		}
		return false;
	}

	/**
	 * @return the razas
	 */
	public ArrayList<RazaDTO> getRazas() {
		return razas;
	}

	/**
	 * @param razas the razas to set
	 */
	public void setRazas(ArrayList<RazaDTO> razas) {
		this.razas = razas;
	}

}
