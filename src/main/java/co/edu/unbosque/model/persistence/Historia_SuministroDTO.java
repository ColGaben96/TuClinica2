package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "historia_suministro")
public class Historia_SuministroDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_historia_suministro")
	private int id;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "idHistoria", nullable = false, updatable = false, insertable = false)
	private HistoriaDTO historia;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "idSuministro", nullable = false, updatable = false, insertable = false)
	private SuministroDTO suministro;

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
