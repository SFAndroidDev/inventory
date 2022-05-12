package com.sfdevs.inventory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sfdevs.inventory.model.User;
import com.sfdevs.inventory.repository.UserRepository;

//import com.sfdevs.cupipaw.model.AuthenticationResponse;
//import com.sfdevs.cupipaw.repository.UserRepository;
//import com.sfdevs.cupipaw.security.jwt.JwtTokenProvider;

@Service
@Transactional
public class UserServiceImpl implements IUserService /*, UserDetailsService*/{

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	private final UserRepository userRepository;
//	private final JwtTokenProvider jwtTokenProvider;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
//		this.jwtTokenProvider = new JwtTokenProvider();
	}
	
	@Override
	public List<User> findAll() {
		List<User> userList = new ArrayList<>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}

	@Override
	public Optional<User> findById(int userId) {
		return userRepository.findById(userId);
	}

	@Override
	public Optional<User> findByFirstName(String firstName) {
		return userRepository.findByFirstName(firstName);
	}

	@Override
	public Optional<User> findByLastName(String lastName) {
		return userRepository.findByLastName(lastName);
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}



	public User create(User user) {
		LOGGER.info("User creation in progress... ");
		return userRepository.save(user);
	}

	public Optional<User> updateById(User user, int id) {
		if (user != null && userRepository.existsById(id)) {
			return  Optional.of(userRepository.save(user));
		} else {
			return null;
		}
	}

	public Optional<User> deleteById(int id) {
		if (!userRepository.existsById(id)) {
			return null;
		}
		
		userRepository.deleteById(id);
		return null;
	}

//	@Override
//	public AuthenticationResponse getToken(@Valid UserDetails userDetails) {
//		
//		// search user by email and password
//		String email = userDetails.getUsername();
//		String password = userDetails.getPassword();
//		
//		String accessToken = jwtTokenProvider.generateToken(userDetails);
//		String refreshToken = jwtTokenProvider.generateToken(userDetails);
//		
//		AuthenticationResponse authenticationResponse = new AuthenticationResponse();
//		authenticationResponse.setAccessToken(accessToken);
//		// TODO add refresh token
//		authenticationResponse.setAccessTokenExpiresIn(jwtTokenProvider.getExpirationDateFromToken(accessToken));
//		
//		return authenticationResponse;
//		
//		
//	}

//	@Override
//	public UserDetails findByEmailAndPassword(String email, String password){
//		
//		Optional<User> optionalUser = userRepository.findByEmailAndPassword(email, password);
//		
//		UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
//				.username(optionalUser.get().getUsername())
//				.password(optionalUser.get().getPassword())
//				.authorities(optionalUser.get().getPerimeter())
//				.build();
//		return userDetails;
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//		User user = findByEmail(username).get();
//		
//		UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
//				.username(username)
//				.password(user.getPassword())
//				.authorities("all")
//				.build();
//		 // TODO: for now our username is our email, change this later
//		
//		return userDetails;
//	}
	
}
