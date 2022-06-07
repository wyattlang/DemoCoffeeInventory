package org.aerospace.training.coffee.repository;

import org.aerospace.training.coffee.repository.entity.DrinkEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<DrinkEntity, Long> {

	
	
}
