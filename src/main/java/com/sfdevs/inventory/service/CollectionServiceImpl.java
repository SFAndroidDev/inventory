package com.sfdevs.inventory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sfdevs.inventory.model.Collection;
import com.sfdevs.inventory.model.User;
import com.sfdevs.inventory.repository.ICollectionRepository;
import com.sfdevs.inventory.repository.IUserRepository;

//import com.sfdevs.cupipaw.model.AuthenticationResponse;
//import com.sfdevs.cupipaw.repository.UserRepository;
//import com.sfdevs.cupipaw.security.jwt.JwtTokenProvider;

@Service
@Transactional
public class CollectionServiceImpl implements ICollectionService /*, UserDetailsService*/{

	private static final Logger LOGGER = LoggerFactory.getLogger(CollectionServiceImpl.class);
	
	private final ICollectionRepository collectionRepository;

	@Autowired
	public CollectionServiceImpl(ICollectionRepository collectionRepository) {
		this.collectionRepository = collectionRepository;
	}

	@Override
	public List<Collection> findAll() {
		List<Collection> collections = new ArrayList<>();
		collectionRepository.findAll().forEach(collections::add);
		return collections;
	}

	@Override
	public Optional<Collection> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Collection> create(List<Collection> collections) {
		LOGGER.info("Collection creation in progress... ");
		return collections.stream()
				.map(collection -> collectionRepository.save(collection))
				.collect(Collectors.toList());
		
	}


//	@Override
//	public Optional<User> findById(int userId) {
//		return userRepository.findById(userId);
//	}
//
//	@Override
//	public Optional<User> findByFirstName(String firstName) {
//		return userRepository.findByFirstName(firstName);
//	}
//
//	@Override
//	public Optional<User> findByLastName(String lastName) {
//		return userRepository.findByLastName(lastName);
//	}
//
//	@Override
//	public Optional<User> findByEmail(String email) {
//		return userRepository.findByEmail(email);
//	}
//
//
//
//	public Optional<User> updateById(User user, int id) {
//		if (user != null && userRepository.existsById(id)) {
//			return  Optional.of(userRepository.save(user));
//		} else {
//			return null;
//		}
//	}
//
//	public Optional<User> deleteById(int id) {
//		if (!userRepository.existsById(id)) {
//			return null;
//		}
//		
//		userRepository.deleteById(id);
//		return null;
//	}
}