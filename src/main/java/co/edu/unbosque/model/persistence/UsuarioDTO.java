package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usuario")
public class UsuarioDTO {

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_usuario")
	private Tipo_UsuarioDTO rol;
	private String nombres;
	private String apellidos;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int id;
	private String num_identificacion;
	private String correo;
	private String contrasena;
	private boolean estado;
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_identificacion")
	private Tipo_IdentificacionDTO tipo_identificacion;

	/**
	 * @return the rol
	 */
	public Tipo_UsuarioDTO getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(Tipo_UsuarioDTO rol) {
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
	public String getNum_identificacion() {
		return num_identificacion;
	}

	/**
	 * @param num_identificacion the num_identificacion to set
	 */
	public void setNum_identificacion(String num_identificacion) {
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
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena the contraseña to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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
