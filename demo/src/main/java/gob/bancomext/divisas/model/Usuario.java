package gob.bancomext.divisas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@Column(name="usuario_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long usuario_id;
	
	@Column(name="domain_user")
	private String domain_user;
	
	@Column(name="email1")
	private String email1;
	
	@Column(name="email2")
	private String email2;
	
	@Column(name="role_id")
	private Long role_id;
	
	@Column(name="perfil_id")
	private Long perfil_id;
	
	public Usuario() {}

	public Usuario(Long usuario_id, String domain_user, String email1, String email2, Long role_id, Long perfil_id) {
		this.usuario_id = usuario_id;
		this.domain_user = domain_user;
		this.email1 = email1;
		this.email2 = email2;
		this.role_id = role_id;
		this.perfil_id = perfil_id;
	}

	public Long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getDomain_user() {
		return domain_user;
	}

	public void setDomain_user(String domain_user) {
		this.domain_user = domain_user;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public Long getPerfil_id() {
		return perfil_id;
	}

	public void setPerfil_id(Long perfil_id) {
		this.perfil_id = perfil_id;
	}

	@Override
	public String toString() {
		return "Usuario [usuario_id=" + usuario_id + ", domain_user=" + domain_user + ", email1=" + email1 + ", email2="
				+ email2 + ", role_id=" + role_id + ", perfil_id=" + perfil_id + "]";
	}
	
}
