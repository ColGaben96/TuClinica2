package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "municipio")
public class MunicipioDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_municipio")
	private int id;
	private String nombre;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "idDepartamento", nullable = false, updatable = false, insertable = false)
	private DepartamentoDTO departamento;

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
	 * @return the departamento
	 */
	public DepartamentoDTO getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(DepartamentoDTO departamento) {
		this.departamento = departamento;
	}

}
