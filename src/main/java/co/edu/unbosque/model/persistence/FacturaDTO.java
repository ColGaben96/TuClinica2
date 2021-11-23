package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "factura")
public class FacturaDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
	private UsuarioDTO dueno;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
	private UsuarioDTO veterinario;
	private Date fecha_servicio;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
	private Tipo_ServicioDTO tipo_servicio;
	private int total_servicio;
	private boolean estado;

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
	public Date getFecha_servicio() {
		return fecha_servicio;
	}

	/**
	 * @param fecha_servicio the fecha_servicio to set
	 */
	public void setFecha_servicio(Date fecha_servicio) {
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
