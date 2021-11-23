package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "historia")
public class HistoriaDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
	private MascotaDTO mascota;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
	private FacturaDTO servicio;
	private String diagnostico;
	public boolean estado;

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
	 * @return the mascota
	 */
	public MascotaDTO getMascota() {
		return mascota;
	}

	/**
	 * @param mascota the mascota to set
	 */
	public void setMascota(MascotaDTO mascota) {
		this.mascota = mascota;
	}

	/**
	 * @return the servicio
	 */
	public FacturaDTO getServicio() {
		return servicio;
	}

	/**
	 * @param servicio the servicio to set
	 */
	public void setServicio(FacturaDTO servicio) {
		this.servicio = servicio;
	}

	/**
	 * @return the diagnotsitco
	 */
	public String getDiagnostico() {
		return diagnostico;
	}

	/**
	 * @param diagnotsitco the diagnotsitco to set
	 */
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
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
