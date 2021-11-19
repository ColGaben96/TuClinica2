package co.edu.unbosque.model.persistence;

public class RazaDTO {
	private int id;
	private String nombre;
	private EspecieDTO especie;

	/**
	 * @param id
	 * @param nombre
	 * @param especie
	 */
	public RazaDTO(int id, String nombre, EspecieDTO especie) {
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
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
	 * @return the especie
	 */
	public EspecieDTO getEspecie() {
		return especie;
	}

	/**
	 * @param especie the especie to set
	 */
	public void setEspecie(EspecieDTO especie) {
		this.especie = especie;
	}

}
