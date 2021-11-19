package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.*;

public class DireccionDAO {
	private ArrayList<DireccionDTO> direcciones = new ArrayList<>();

	public DireccionDTO buscarId(int identificacion) {
		for (DireccionDTO encontrado : direcciones) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarHisotria_suministro(int id, String direccion, String barrio, MunicipioDTO municipio,
			UsuarioDTO usuario) {
		var direccionObj = new DireccionDTO(id, direccion, barrio, municipio, usuario);
		if (buscarId(id) == null) {
			direcciones.add(direccionObj);
			return true;
		}
		return false;
	}

	/**
	 * @return the direcciones
	 */
	public ArrayList<DireccionDTO> getDirecciones() {
		return direcciones;
	}

	/**
	 * @param direcciones the direcciones to set
	 */
	public void setDirecciones(ArrayList<DireccionDTO> direcciones) {
		this.direcciones = direcciones;
	}
}
