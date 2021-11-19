package co.edu.unbosque.model.persistence;

public class MascotaDTO {
	private String raza;
	private int id;
	private String nombre;
	private String color;
	private String tamano;
	private String fecha_nacimiento;
	private String detalles;
	private UsuarioDTO dueno;
	private boolean estado;

	/**
	 * @param raza
	 * @param id
	 * @param nombre
	 * @param color
	 * @param tamano
	 * @param fecha_nacimiento
	 * @param detalles
	 * @param dueno
	 * @param estado
	 */
	public MascotaDTO(String raza, int id, String nombre, String color, String tamano, String fecha_nacimiento,
			String detalles, UsuarioDTO dueno, boolean estado) {
		this.raza = raza;
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.tamano = tamano;
		this.fecha_nacimiento = fecha_nacimiento;
		this.detalles = detalles;
		this.dueno = dueno;
		this.estado = estado;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the tamano
	 */
	public String getTamano() {
		return tamano;
	}

	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	/**
	 * @return the fecha_nacimiento
	 */
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	/**
	 * @return the detalles
	 */
	public String getDetalles() {
		return detalles;
	}

	/**
	 * @param detalles the detalles to set
	 */
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	/**
	 * @return the dueno
	 */
	public UsuarioDTO getDueno() {
		return dueno;
	}

	/**
	 * @param dueno the dueno to set
	 */
	public void setDueno(UsuarioDTO dueno) {
		this.dueno = dueno;
	}

	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
