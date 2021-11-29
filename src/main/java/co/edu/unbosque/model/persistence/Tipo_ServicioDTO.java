package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tipo_servicio")
public class Tipo_ServicioDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_servicio")
	private int id;
	private String nombre;
	private int tarifa;

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
	 * @return the tarifa
	 */
	public int getTarifa() {
		return tarifa;
	}

	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

}
