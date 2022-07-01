package com.sfdevs.inventory.service;

import java.util.List;
import java.util.Optional;

import com.sfdevs.inventory.model.Collection;

public interface ICollectionService {

	List<Collection> findAll();
	
	Optional<Collection> findById(int id);

	List<Collection> create(List<Collection> collections);
}
