package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.*;

public class DepartamentoDAO {
	private ArrayList<DepartamentoDTO> departamentos = new ArrayList<>();

	public DepartamentoDTO buscarId(int identificacion) {
		for (DepartamentoDTO encontrado : departamentos) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarDepartamento(int id, String nombre, PaisDTO pais) {
		var departamento = new DepartamentoDTO(id, nombre, pais);
		if (buscarId(id) == null) {
			departamentos.add(departamento);
			return true;
		}
		return false;
	}

	/**
	 * @return the departamentos
	 */
	public ArrayList<DepartamentoDTO> getDepartamentos() {
		return departamentos;
	}

	/**
	 * @param departamentos the departamentos to set
	 */
	public void setDepartamentos(ArrayList<DepartamentoDTO> departamentos) {
		this.departamentos = departamentos;
	}
}
