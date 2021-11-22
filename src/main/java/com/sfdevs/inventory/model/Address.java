package com.sfdevs.inventory.model;

import javax.persistence.Embeddable;


@Embeddable
public class Address {
	
	private int streetNumber;
	private String street;
	private String city;
	private String zipCode;
	
	/*
	 * dans le cas ou on a plusieurs addresses, on ajoute:
	 * @ManyToOne
	 * private DogOwner dogOwner;
	 * 
	 * same thing for the dogs
	 * 
	 
	;
	*/
	public Address() {
		
	}

	public Address(int streetNumber, String street, String city, String zipCode) {
		super();
		this.streetNumber = streetNumber;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
