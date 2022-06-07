package org.aerospace.training.coffee.service;

import org.aerospace.training.coffee.dto.DrinkDTO;
import org.aerospace.training.coffee.repository.entity.DrinkEntity;

public interface DrinkMapper {

	DrinkEntity toEntity(DrinkDTO drinkDto);
	
	DrinkDTO toDto(DrinkEntity drinkEntity);
	
}
