package co.edu.unbosque.model.persistence;

public class DireccionDTO {
	private int id;
	private String direccion;
	private String barrio;
	private MunicipioDTO municipio;
	private UsuarioDTO usuario;

	/**
	 * @param id
	 * @param direccion
	 * @param barrio
	 * @param municipio
	 * @param usuario
	 */
	public DireccionDTO(int id, String direccion, String barrio, MunicipioDTO municipio, UsuarioDTO usuario) {
		this.id = id;
		this.direccion = direccion;
		this.barrio = barrio;
		this.municipio = municipio;
		this.usuario = usuario;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the barrio
	 */
	public String getBarrio() {
		return barrio;
	}

	/**
	 * @param barrio the barrio to set
	 */
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	/**
	 * @return the municipio
	 */
	public MunicipioDTO getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(MunicipioDTO municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the usuario
	 */
	public UsuarioDTO getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

}
