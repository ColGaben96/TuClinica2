package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.*;

public class MascotaDAO {
	private ArrayList<MascotaDTO> mascotas = new ArrayList<>();

	public MascotaDTO buscarId(int identificacion) {
		for (MascotaDTO encontrado : mascotas) {
			if (encontrado.getId() == identificacion) {
				return encontrado;
			}
		}
		return null;
	}

	public boolean agregarMascota(String raza, int id, String nombre, String color, String tamano,
			String fecha_nacimiento, String detalles, UsuarioDTO dueno, boolean estado) {
		var mascota = new MascotaDTO(raza, id, nombre, color, tamano, fecha_nacimiento, detalles, dueno, estado);
		if (buscarId(id) == null) {
			mascotas.add(mascota);
			return true;
		}
		return false;
	}

	public boolean desactivarMascota(MascotaDTO mascota, int id) {
		if (buscarId(id) == null) {
			return false;
		} else {
			mascota.setEstado(false);
			return true;
		}
	}

	public void actualizarMascota(MascotaDTO mascota, String raza, int id, String nombre, String color, String tamano,
			String fecha_nacimiento, String detalles, UsuarioDTO dueno, boolean estado) {
		mascota.setRaza(raza);
		mascota.setId(id);
		mascota.setNombre(nombre);
		mascota.setColor(color);
		mascota.setTamano(tamano);
		mascota.setFecha_nacimiento(fecha_nacimiento);
		mascota.setDetalles(detalles);
		mascota.setDueno(dueno);
		mascota.setEstado(estado);
	}

	/**
	 * @return the mascotas
	 */
	public ArrayList<MascotaDTO> getMascotas() {
		return mascotas;
	}

	/**
	 * @param mascotas the mascotas to set
	 */
	public void setMascotas(ArrayList<MascotaDTO> mascotas) {
		this.mascotas = mascotas;
	}

}
