package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String brand;
	private String name;
	private String registration;
	private boolean owned;
		
	public Vehicle() {
		super();
	
	}

	public Vehicle(Long id, String brand, String name, String registration, boolean owned) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.registration = registration;
		this.owned = owned;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public boolean isOwned() {
		return owned;
	}

	public void setOwned(boolean owned) {
		this.owned = owned;
	}
	
	
	
}
