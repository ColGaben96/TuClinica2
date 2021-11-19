package co.edu.unbosque.model.persistence;

public class MunicipioDTO {
	private int id;
	private String nombre;
	private DepartamentoDTO departamento;

	/**
	 * @param id
	 * @param nombre
	 * @param departamento
	 */
	public MunicipioDTO(int id, String nombre, DepartamentoDTO departamento) {
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
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
	 * @return the departamento
	 */
	public DepartamentoDTO getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(DepartamentoDTO departamento) {
		this.departamento = departamento;
	}

}
