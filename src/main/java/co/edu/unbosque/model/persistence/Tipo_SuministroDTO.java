package co.edu.unbosque.model.persistence;

public class Tipo_SuministroDTO {
	private int id;
	private String nombre;

	/**
	 * @param id
	 * @param nombre
	 */
	public Tipo_SuministroDTO(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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

}