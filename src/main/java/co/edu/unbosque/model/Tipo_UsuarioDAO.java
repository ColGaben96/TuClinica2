package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.Tipo_UsuarioDTO;

public class Tipo_UsuarioDAO {
	private ArrayList<Tipo_UsuarioDTO> tipos = new ArrayList<>();

	public Tipo_UsuarioDTO buscarId(int id) {
		for (Tipo_UsuarioDTO encontrado : tipos) {
			if (encontrado.getId() == id) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarTipo_Usuario(int id, String nombre) {
		var tipo = new Tipo_UsuarioDTO(id, nombre);
		if (buscarId(id) == null) {
			tipos.add(tipo);
			return true;
		}
		return false;
	}

	/**
	 * @return the tipos
	 */
	public ArrayList<Tipo_UsuarioDTO> getTipos() {
		return tipos;
	}

	/**
	 * @param tipos the tipos to set
	 */
	public void setTipos(ArrayList<Tipo_UsuarioDTO> tipos) {
		this.tipos = tipos;
	}
	

}
