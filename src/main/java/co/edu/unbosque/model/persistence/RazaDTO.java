package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "raza")
public class RazaDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
	private EspecieDTO especie;

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
	 * @return the especie
	 */
	public EspecieDTO getEspecie() {
		return especie;
	}

	/**
	 * @param especie the especie to set
	 */
	public void setEspecie(EspecieDTO especie) {
		this.especie = especie;
	}

}
