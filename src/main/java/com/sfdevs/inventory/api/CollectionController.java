package com.sfdevs.inventory.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfdevs.inventory.exception.ObjectNotFoundException;
import com.sfdevs.inventory.model.Collection;
import com.sfdevs.inventory.model.User;
import com.sfdevs.inventory.service.ICollectionService;
import com.sfdevs.inventory.service.IUserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Tag(name = "Collection")
@RestController
@RequestMapping(value = "/collections", produces = MediaType.APPLICATION_JSON_VALUE)
public class CollectionController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	private final ICollectionService collectionService;
	
	@Autowired
	public CollectionController(ICollectionService collectionService) {
		this.collectionService = collectionService;
	}
	
	@Operation(summary = "Find all collections")
	@GetMapping()
	public List<Collection> findAll() {
		LOGGER.info("Find all users");
		return collectionService.findAll();
		
	}
	
//	@Operation(summary = "Find user by ID")
//	@GetMapping(path = "id/{userId}")
//	public User findById(@PathVariable int userId) {
//		LOGGER.info("Find user by ID {}", userId);
//		return userService.findById(userId)
//				.orElseThrow(() -> new ObjectNotFoundException("User not found with ID {} " + userId));
//		
//	}
////	
	
	@Operation(summary = "Create a new collection")
	@PostMapping()
	public List<Collection> create(@RequestBody @NotEmpty List<@Valid Collection> collections ) {
		LOGGER.info("Creation of a new collection in progress...");
		return collectionService.create(collections);
		
	}
//	@Operation(summary = "Find user by firstname")
//	@GetMapping(path = "firstname/{firstName}")
//	public User findByFirstName(@PathVariable String firstName) {
//		LOGGER.info("Find user by firstname {}", firstName);
//		return userService.findByFirstName(firstName)
//				.orElseThrow(() -> new ObjectNotFoundException("User not found with firstName {} " + firstName));
//		
//	}
//	
//	@Operation(summary = "Find user by lastname")
//	@GetMapping(path = "lastname/{lastName}")
//	public User findByLastName(@PathVariable String lastName) {
//		LOGGER.info("Find user by lastname {}", lastName);
//		return userService.findByLastName(lastName)
//				.orElseThrow(() -> new ObjectNotFoundException("User not found with lastName {} " + lastName));
//		
//	}
//	
//	@Operation(summary = "Find user by email")
//	@GetMapping(path = "email/{email}")
//	public User findByEmail(@PathVariable String email) {
//		LOGGER.info("Find user by email {}", email);
//		return userService.findByEmail(email)
//				.orElseThrow(() -> new ObjectNotFoundException("User not found with email {} " + email));
//		
//	}

}
