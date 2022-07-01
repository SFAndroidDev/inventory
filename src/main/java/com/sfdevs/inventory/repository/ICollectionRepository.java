package com.sfdevs.inventory.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sfdevs.inventory.model.Collection;

@Transactional
@Repository
public interface ICollectionRepository extends CrudRepository<Collection, Integer>{

}
