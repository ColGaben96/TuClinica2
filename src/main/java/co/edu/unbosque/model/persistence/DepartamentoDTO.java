package co.edu.unbosque.model.persistence;

public class DepartamentoDTO {
	private int id;
	private String nombre;
	private PaisDTO pais;

	/**
	 * @param id
	 * @param nombre
	 * @param pais
	 */
	public DepartamentoDTO(int id, String nombre, PaisDTO pais) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
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
	 * @return the pais
	 */
	public PaisDTO getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(PaisDTO pais) {
		this.pais = pais;
	}

}
