package com.muruna.evaluacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Phones")
public class Phone {
	
	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String number;
    private int citycode;
    private int contrycode;
    
    
    public Phone() {
    	super();
    }
    	
    /**
	 * @param number
	 * @param citycode
	 * @param contrycode
	 */
	public Phone(String number, int citycode, int contrycode) {
		super();
		this.number = number;
		this.citycode = citycode;
		this.contrycode = contrycode;
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

	public int getContrycode() {
		return contrycode;
	}

	public void setContrycode(int contrycode) {
		this.contrycode = contrycode;
	}

	@Override
	public String toString() {
		return "Phones [number=" + number + ", citycode=" + citycode + ", contrycode=" + contrycode + "]";
	}
	
}
