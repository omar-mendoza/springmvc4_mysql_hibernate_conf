package gob.bancomext.divisas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="perfil")
public class Perfil {

	@Id
	@Column(name="perfil_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long perfil_id;
	
	@Column(name="descripcion")
	private String descripcion;
	
	public Perfil(){}

	public Perfil(Long perfil_id, String descripcion) {
		this.perfil_id = perfil_id;
		this.descripcion = descripcion;
	}

	public Long getPerfil_id() {
		return perfil_id;
	}

	public void setPerfil_id(Long perfil_id) {
		this.perfil_id = perfil_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Perfil [perfil_id=" + perfil_id + ", descripcion=" + descripcion + "]";
	}
	
}
