package com.sfdevs.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Table(name = "user")
@Entity
@Data
@Getter
@Setter
public class User{
	// TODO install LOMBOK

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	@NotBlank
	private String firstName;
	
	@Column(name = "last_name")
	@NotBlank
	private String lastName;
	
	@Column(name = "age")
	@NotBlank
	private int age;
	
	@Column(name = "username")
	@NotBlank
	private String username;
	
	@Column(name = "email")
	@NotBlank
	@Email
	private String email;
	
	@Column(name = "password")
	@NotBlank
	private String password;
	
	@Column(name = "perimeter")
	@NotBlank
	private String perimeter;
	
	@Column(name = "readonly")
	@NotBlank
	private int readonly;


	
}
