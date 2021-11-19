package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.*;

public class HistoriaDAO {
	private ArrayList<HistoriaDTO> historias = new ArrayList<>();

	public HistoriaDTO buscarId(int identificacion) {
		for (HistoriaDTO encontrado : historias) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarHisotria(int id, MascotaDTO mascota, FacturaDTO servicio, String diagnostico,
			boolean estado) {
		var historia = new HistoriaDTO(id, mascota, servicio, diagnostico, estado);
		if (buscarId(id) == null) {
			historias.add(historia);
			return true;
		}
		return false;
	}

	public boolean desactivarHisotria(HistoriaDTO historia, int id) {
		if (buscarId(id) == null) {
			return false;
		} else {
			historia.setEstado(false);
			return true;
		}
	}

	public void actualizarHisotria(HistoriaDTO historia, int id, MascotaDTO mascota, FacturaDTO servicio,
			String diagnostico, boolean estado) {

		historia.setId(id);
		historia.setMascota(mascota);
		historia.setServicio(servicio);
		historia.setDiagnostico(diagnostico);
		historia.setEstado(estado);
	}

	/**
	 * @return the historias
	 */
	public ArrayList<HistoriaDTO> getHistorias() {
		return historias;
	}

	/**
	 * @param historias the historias to set
	 */
	public void setHistorias(ArrayList<HistoriaDTO> historias) {
		this.historias = historias;
	}

}
