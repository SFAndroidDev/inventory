package com.sfdevs.inventory.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sfdevs.inventory.model.User;


@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
//	List<Owner> findAllBylNameContaining(String partOflName);
//	List<Owner> findAllByfNameContaining(String partOffName);
	Optional<User> findByFirstName(String firstName);
	
	Optional<User> findByLastName(String lastName);
	
	Optional<User> findByEmail(String email);
	
	@Query("select u from User u where u.email = :email and u.password = :password")
	Optional<User> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
	
}
