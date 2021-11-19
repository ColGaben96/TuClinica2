package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.*;

public class Historia_SuministroDAO {
	private ArrayList<Historia_SuministroDTO> historias_suministros = new ArrayList<>();

	public Historia_SuministroDTO buscarId(int identificacion) {
		for (Historia_SuministroDTO encontrado : historias_suministros) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarHisotria_suministro(int id, HistoriaDTO historia, SuministroDTO suministro) {
		var historia_suministro = new Historia_SuministroDTO(id, historia, suministro);
		if (buscarId(id) == null) {
			historias_suministros.add(historia_suministro);
			return true;
		}
		return false;
	}

	/**
	 * @return the historias_suministros
	 */
	public ArrayList<Historia_SuministroDTO> getHistorias_suministros() {
		return historias_suministros;
	}

	/**
	 * @param historias_suministros the historias_suministros to set
	 */
	public void setHistorias_suministros(ArrayList<Historia_SuministroDTO> historias_suministros) {
		this.historias_suministros = historias_suministros;
	}

}
