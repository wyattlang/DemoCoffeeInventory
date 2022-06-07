package org.aerospace.training.coffee.service;

import java.util.List;

import org.aerospace.training.coffee.dto.DrinkDTO;

public interface DrinkService {

	DrinkDTO save(DrinkDTO drinkDto);

	DrinkDTO findById(Long id);

	List<DrinkDTO> findAllDrinks();
	
}
