package co.edu.unbosque.model.persistence;

public class Historia_SuministroDTO {
	private int id;
	private HistoriaDTO historia;
	private SuministroDTO suministro;

	/**
	 * @param id
	 * @param historia
	 * @param suministro
	 */
	public Historia_SuministroDTO(int id, HistoriaDTO historia, SuministroDTO suministro) {
		this.id = id;
		this.historia = historia;
		this.suministro = suministro;
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
	 * @return the historia
	 */
	public HistoriaDTO getHistoria() {
		return historia;
	}

	/**
	 * @param historia the historia to set
	 */
	public void setHistoria(HistoriaDTO historia) {
		this.historia = historia;
	}

	/**
	 * @return the suministro
	 */
	public SuministroDTO getSuministro() {
		return suministro;
	}

	/**
	 * @param suministro the suministro to set
	 */
	public void setSuministro(SuministroDTO suministro) {
		this.suministro = suministro;
	}

}
