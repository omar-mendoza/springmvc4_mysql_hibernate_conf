package gob.bancomext.divisas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {

	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long role_id;
	
	@Column(name="descripcion")
	private String descripcion;
	
	public Role() {}

	public Role(Long role_id, String descripcion) {
		this.role_id = role_id;
		this.descripcion = descripcion;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", descripcion=" + descripcion + "]";
	}
	
}
