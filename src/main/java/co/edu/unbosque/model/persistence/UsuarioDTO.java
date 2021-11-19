package co.edu.unbosque.model.persistence;

public class UsuarioDTO {

	private String rol;
	private String nombres;
	private String apellidos;
	private int id;
	private int num_identificacion;
	private String correo;
	private String contraseña;
	private boolean estado;
	private Tipo_IdentificacionDTO tipo_identificacion;

	/**
	 * @param rol
	 * @param nombres
	 * @param apellidos
	 * @param tipo_identificacion2
	 * @param id
	 * @param num_identificacion
	 * @param correo
	 * @param contraseña
	 */
	public UsuarioDTO(String rol, String nombres, String apellidos, Tipo_IdentificacionDTO tipo_identificacion2, int id,
			int num_identificacion, String correo, String contraseña, boolean estado) {
		this.rol = rol;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_identificacion = tipo_identificacion2;
		this.id = id;
		this.num_identificacion = num_identificacion;
		this.correo = correo;
		this.contraseña = contraseña;
		this.estado = estado;
	}

	/**
	 * @return the rol
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the tipo_identificacion
	 */
	public Tipo_IdentificacionDTO getTipo_identificacion() {
		return tipo_identificacion;
	}

	/**
	 * @param tipo_identificacion the tipo_identificacion to set
	 */
	public void setTipo_identificacion(Tipo_IdentificacionDTO tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
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
	 * @return the num_identificacion
	 */
	public int getNum_identificacion() {
		return num_identificacion;
	}

	/**
	 * @param num_identificacion the num_identificacion to set
	 */
	public void setNum_identificacion(int num_identificacion) {
		this.num_identificacion = num_identificacion;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
