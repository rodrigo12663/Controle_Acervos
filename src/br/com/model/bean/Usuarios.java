package br.com.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

@Entity
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	@Column(name="NomeUsuario")
	private String NomeUsuario;
	@Column(name="EmailUsuario")
	private String EmailUsuario;
	@Column(name="SenhaUsuario")
	private String SenhaUsuario;
	
	
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return NomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	public String getEmailUsuario() {
		return EmailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		EmailUsuario = emailUsuario;
	}
	public String getSenhaUsuario() {
		return SenhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		SenhaUsuario = senhaUsuario;
	}
	
}
