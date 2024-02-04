package com.muruna.evaluacion.model;

import java.util.Date;
import java.util.UUID;

public class CreateResponse {
	
	private String id;
	private Date created;
	private Date modified;
	private Date last_login;
	private UUID token;
	private boolean isActive;
	
	/**
	 * @param id: id del usuario
	 * @param created: fecha de creacion del usuario
	 * @param modified: fecha de la ultima actualizacion del usuario
	 * @param last_login: fecha del ultimo ingreso del usuario
	 * @param token: token de acceso de la api
	 * @param isActive: indica si el usuario sigue habilitado en el sistema
	 */
	
	public CreateResponse() {
		super();
	}
	
	public CreateResponse(String id, Date created, Date modified, Date last_login, UUID token, boolean isActive) {
		super();
		this.id = id;
		this.created = created;
		this.modified = modified;
		this.last_login = last_login;
		this.token = token;
		this.isActive = isActive;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public UUID getToken() {
		return token;
	}

	public void setToken(UUID token) {
		this.token = token;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Response [id=" + id + ", created=" + created + ", modified=" + modified + ", last_login=" + last_login
				+ ", token=" + token + ", isActive=" + isActive + "]";
	}
	
}
