package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.*;

public class MunicipioDAO {
	private ArrayList<MunicipioDTO> municipios = new ArrayList<>();

	public MunicipioDTO buscarId(int identificacion) {
		for (MunicipioDTO encontrado : municipios) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarDepartamento(int id, String nombre, DepartamentoDTO departamento) {
		var municipio = new MunicipioDTO(id, nombre, departamento);
		if (buscarId(id) == null) {
			municipios.add(municipio);
			return true;
		}
		return false;
	}

	/**
	 * @return the municipios
	 */
	public ArrayList<MunicipioDTO> getMunicipios() {
		return municipios;
	}

	/**
	 * @param municipios the municipios to set
	 */
	public void setMunicipios(ArrayList<MunicipioDTO> municipios) {
		this.municipios = municipios;
	}

}
