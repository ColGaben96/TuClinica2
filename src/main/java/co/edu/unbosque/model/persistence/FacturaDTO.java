package co.edu.unbosque.model.persistence;

public class FacturaDTO {
	private int id;
	private UsuarioDTO dueno;
	private UsuarioDTO veterinario;
	private String fecha_servicio;
	private Tipo_ServicioDTO tipo_servicio;
	private int total_servicio;
	private boolean estado;

	/**
	 * @param id
	 * @param dueno
	 * @param veterinario
	 * @param fecha_servicio
	 * @param tipo_servicio
	 * @param total_servicio
	 * @param estado
	 */
	public FacturaDTO(int id, UsuarioDTO dueno, UsuarioDTO veterinario, String fecha_servicio,
			Tipo_ServicioDTO tipo_servicio, int total_servicio, boolean estado) {
		this.id = id;
		this.dueno = dueno;
		this.veterinario = veterinario;
		this.fecha_servicio = fecha_servicio;
		this.tipo_servicio = tipo_servicio;
		this.total_servicio = total_servicio;
		this.estado = estado;
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
	 * @return the veterinario
	 */
	public UsuarioDTO getVeterinario() {
		return veterinario;
	}

	/**
	 * @param veterinario the veterinario to set
	 */
	public void setVeterinario(UsuarioDTO veterinario) {
		this.veterinario = veterinario;
	}

	/**
	 * @return the fecha_servicio
	 */
	public String getFecha_servicio() {
		return fecha_servicio;
	}

	/**
	 * @param fecha_servicio the fecha_servicio to set
	 */
	public void setFecha_servicio(String fecha_servicio) {
		this.fecha_servicio = fecha_servicio;
	}

	/**
	 * @return the tipo_servicio
	 */
	public Tipo_ServicioDTO getTipo_servicio() {
		return tipo_servicio;
	}

	/**
	 * @param tipo_servicio the tipo_servicio to set
	 */
	public void setTipo_servicio(Tipo_ServicioDTO tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	/**
	 * @return the total_servicio
	 */
	public int getTotal_servicio() {
		return total_servicio;
	}

	/**
	 * @param total_servicio the total_servicio to set
	 */
	public void setTotal_servicio(int total_servicio) {
		this.total_servicio = total_servicio;
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
