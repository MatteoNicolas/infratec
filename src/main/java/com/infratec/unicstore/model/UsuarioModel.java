package com.infratec.unicstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name= "user") //Informa que essa classe é uma entidade de BD (uma tabela).
public class UsuarioModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	public Integer id;
	
	@Column (nullable = false, length = 50)
	public String name;
	
	@Column (nullable = false, length = 10)
	public String login;
	
	@Column (nullable = false, length = 10)
	public String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
