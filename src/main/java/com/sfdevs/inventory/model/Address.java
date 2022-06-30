package com.sfdevs.inventory.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
	
}
