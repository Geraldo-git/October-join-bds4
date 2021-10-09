package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Role;

public class RoleDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String autorithy;
	
	public RoleDTO() {
		
	}

	public RoleDTO(Long id, String autorithy) {
		this.id = id;
		this.autorithy = autorithy;
	}
	
	public RoleDTO(Role role) {
		super();
		id = role.getId();
		autorithy = role.getAuthority();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutorithy() {
		return autorithy;
	}

	public void setAutorithy(String autorithy) {
		this.autorithy = autorithy;
	}
	

}
