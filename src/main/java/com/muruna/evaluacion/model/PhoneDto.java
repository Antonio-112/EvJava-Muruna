package com.muruna.evaluacion.model;
import jakarta.validation.constraints.NotBlank;

public class PhoneDto {

    private String id;

    @NotBlank(message = "El número de teléfono es obligatorio")
    private String number;

    private int citycode;
    private int countrycode;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getCitycode() {
		return citycode;
	}
	public void setCitycode(int citycode) {
		this.citycode = citycode;
	}
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}

    

    // Puedes agregar validaciones personalizadas si es necesario
}

