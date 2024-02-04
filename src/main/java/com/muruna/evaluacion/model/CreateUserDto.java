package com.muruna.evaluacion.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

public class CreateUserDto {
	@Valid
	private String id;

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @Email(message = "El correo electrónico debe ser válido")
    @NotBlank(message = "El correo electrónico es obligatorio")
    private String email;

    private String password;

    private List<PhoneDto> phones;
    private boolean isActive;
   
    
    public CreateUserDto() {
    	super();
    }
    
    /**
	 * @param id
	 * @param name
	 * @param email
	 * @param password
	 * @param phones
	 * @param isActive
	 */
	public CreateUserDto(String id, @NotBlank(message = "El nombre es obligatorio") String name,
			@Email(message = "El correo electrónico debe ser válido") @NotBlank(message = "El correo electrónico es obligatorio") String email,
			String password,
			List<PhoneDto> phones, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phones = phones;
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
	public List<PhoneDto> getPhones() {
		return phones;
	}
	public void setPhones(List<PhoneDto> phones) {
		this.phones = phones;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
