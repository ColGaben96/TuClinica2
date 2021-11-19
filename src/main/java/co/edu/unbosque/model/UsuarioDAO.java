package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.*;

public class UsuarioDAO {
	private ArrayList<UsuarioDTO> usuarios = new ArrayList<>();

	public UsuarioDTO buscarIdentificacion(int identificacion) {
		for (UsuarioDTO encontrado : usuarios) {
			if (encontrado.getNum_identificacion() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarUsuario(String rol, String nombres, String apellidos,
			Tipo_IdentificacionDTO tipo_identificacion, int id, int num_identificacion, String correo,
			String contraseña, boolean estado) {
		var usuario = new UsuarioDTO(rol, nombres, apellidos, tipo_identificacion, id, num_identificacion, correo,
				contraseña, estado);
		if (buscarIdentificacion(num_identificacion) == null) {
			usuarios.add(usuario);
			return true;
		}
		return false;
	}

	public boolean desactivarUsuario(UsuarioDTO usuario, int identificacion) {
		if (buscarIdentificacion(identificacion) == null) {
			return false;
		} else {
			usuario.setEstado(false);
			return true;
		}
	}

	public void actualizarUsuario(UsuarioDTO usuario, String rol, String nombres, String apellidos,
			Tipo_IdentificacionDTO tipo_identificacion, int id, int num_identificacion, String correo,
			String contraseña) {
		usuario.setRol(rol);
		usuario.setNombres(nombres);
		usuario.setApellidos(apellidos);
		usuario.setTipo_identificacion(tipo_identificacion);
		usuario.setNum_identificacion(num_identificacion);
		usuario.setId(id);
		usuario.setCorreo(correo);
		usuario.setContraseña(contraseña);
	}

	/**
	 * @return the usuarios
	 */
	public ArrayList<UsuarioDTO> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(ArrayList<UsuarioDTO> usuarios) {
		this.usuarios = usuarios;
	}

}
