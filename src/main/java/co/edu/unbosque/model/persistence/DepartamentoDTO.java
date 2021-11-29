package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

//hola
@Entity
@Data
@Table(name = "departamento")
public class DepartamentoDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private int id;
	private String nombre;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_pais")
	private PaisDTO id_pais;

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
	 * @return the pais
	 */
	public PaisDTO getId_pais() {
		return id_pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setId_pais(PaisDTO pais) {
		this.id_pais = pais;
	}
}
