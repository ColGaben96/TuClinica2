package co.edu.unbosque.model.persistence;

public class Tipo_ServicioDTO {
	private int id;
	private String nombre;
	private int tarifa;

	/**
	 * @param id
	 * @param nombre
	 * @param tarifa
	 */
	public Tipo_ServicioDTO(int id, String nombre, int tarifa) {
		this.id = id;
		this.nombre = nombre;
		this.tarifa = tarifa;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tarifa
	 */
	public int getTarifa() {
		return tarifa;
	}

	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

}
