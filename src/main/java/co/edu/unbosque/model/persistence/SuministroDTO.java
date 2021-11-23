package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "suministro")
public class SuministroDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String via_administracion;
	private String fabricante;
	private int precio;
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
	private Tipo_SuministroDTO tipo_suministro;

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
	 * @return the via_administracion
	 */
	public String getVia_administracion() {
		return via_administracion;
	}

	/**
	 * @param via_administracion the via_administracion to set
	 */
	public void setVia_administracion(String via_administracion) {
		this.via_administracion = via_administracion;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the tipo_suministro
	 */
	public Tipo_SuministroDTO getTipo_suministro() {
		return tipo_suministro;
	}

	/**
	 * @param tipo_suministro the tipo_suministro to set
	 */
	public void setTipo_suministro(Tipo_SuministroDTO tipo_suministro) {
		this.tipo_suministro = tipo_suministro;
	}

}
