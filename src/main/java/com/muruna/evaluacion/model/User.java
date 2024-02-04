package com.muruna.evaluacion.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity(name = "app_user")
public class User {

	/**
	 * @param id 
	 * @param name
	 * @param email
	 * @param password
	 * @param last_login
	 * @param createdAt
	 * @param updatedAt
	 */
	
	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String name;
	private String email;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Phone> phones;
	
	
    @Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	private Date updatedAt;
	private Date last_login;
	
	private UUID token;
	private boolean isActive;
	
	public User() {
		super();
	}
	
	public User(String id, String name, String email, List<Phone> phones, String password, Date last_login,
			Date updatedAt, boolean isActive) {
		
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.setPhones(phones);
		this.password = password;
		this.last_login = last_login;
		this.createdAt = new Date();
		this.updatedAt = updatedAt;
		this.isActive = isActive;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLastLogin(Date lastLogin) {
		this.last_login = lastLogin;
	}
	public Date getCreatedAt() {
		return createdAt;
	}	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public UUID getToken() {
		return token;
	}

	public void setToken(UUID token) {
		this.token = token;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", last_login=" + last_login
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	@PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
        this.isActive = true;
        this.token = UUID.randomUUID();
        this.updatedAt = this.createdAt;
        this.last_login = this.createdAt;
    }
	
	@PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
	
	public void updateLastLogin() {
        this.last_login = new Date();
    }
	
}
