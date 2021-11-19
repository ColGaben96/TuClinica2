package co.edu.unbosque.model.persistence;

public class HistoriaDTO {
	private int id;
	private MascotaDTO mascota;
	private FacturaDTO servicio;
	private String diagnostico;
	public boolean estado;

	/**
	 * @param id
	 * @param mascota
	 * @param servicio
	 * @param diagnotsitco
	 * @param estado
	 */
	public HistoriaDTO(int id, MascotaDTO mascota, FacturaDTO servicio, String diagnostico, boolean estado) {
		this.id = id;
		this.mascota = mascota;
		this.servicio = servicio;
		this.diagnostico = diagnostico;
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
