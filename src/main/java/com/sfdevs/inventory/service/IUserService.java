package com.sfdevs.inventory.service;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

import com.sfdevs.inventory.model.User;

public interface IUserService {

	List<User> findAll();

	Optional<User> findById(int userId);
	
	Optional<User> findByFirstName(String firstName);
	
	Optional<User> findByLastName(String lastName);
	
	Optional<User> findByEmail(String email);
	
	Optional<User> updateById(User user, int userId);
	
	Optional<User> deleteById(int userId);

//	AuthenticationResponse getToken(@Valid UserDetails userDetails);
//
//	UserDetails findByEmailAndPassword(String email, String password);
	
}
