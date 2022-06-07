package org.aerospace.training.coffee.controller;

import java.util.List;

import org.aerospace.training.coffee.dto.DrinkDTO;
import org.aerospace.training.coffee.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrinkController {
	
	@Autowired
	private DrinkService drinkService;

	@PostMapping("/drink")
	public DrinkDTO postDrink(@RequestBody DrinkDTO drinkDto) {
		DrinkDTO savedDrinkDto = drinkService.save(drinkDto);
		return savedDrinkDto;
	}
	
	@GetMapping("/drink/{id}")
	public DrinkDTO getDrink(@PathVariable Long id) {
		DrinkDTO foundDrink = drinkService.findById(id);
		return foundDrink;
	}
	
	@GetMapping("/drink")
	public List<DrinkDTO> getAllDrinks() {
		List<DrinkDTO> allDrinks = drinkService.findAllDrinks();
		return allDrinks;
	}
	
}
