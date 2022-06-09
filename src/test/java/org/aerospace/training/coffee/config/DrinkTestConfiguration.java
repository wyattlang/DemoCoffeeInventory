package org.aerospace.training.coffee.config;

import org.aerospace.training.coffee.dto.DrinkDTO;
import org.aerospace.training.coffee.repository.entity.DrinkEntity;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class DrinkTestConfiguration {
	
	@Bean("blackCoffeeDrinkDtoNoId")
	public DrinkDTO blackCoffeeDrinkDtoNoId() {
		DrinkDTO blackCoffeeDrinkDtoNoId = new DrinkDTO();
		blackCoffeeDrinkDtoNoId.setName("black coffee");
		blackCoffeeDrinkDtoNoId.setSize("XL");
		blackCoffeeDrinkDtoNoId.setMilligramsCaffeine(80);
		blackCoffeeDrinkDtoNoId.setGramsSugar(0);
		return blackCoffeeDrinkDtoNoId;
	}
	
	@Bean("drinkEntityFromMockNoId")
	public DrinkEntity drinkEntityFromMockNoId() {
		DrinkEntity drinkEntityFromMockNoId = new DrinkEntity();
		drinkEntityFromMockNoId.setName("black coffee");
		drinkEntityFromMockNoId.setSize("XL");
		drinkEntityFromMockNoId.setMilligramsCaffeine(80);
		drinkEntityFromMockNoId.setGramsSugar(0);
		return drinkEntityFromMockNoId;
	}
	
	@Bean("drinkEntityFromMockWithId")
	public DrinkEntity drinkEntityFromMockWithId() {
		DrinkEntity drinkEntityFromMockWithId = new DrinkEntity();
		drinkEntityFromMockWithId.setId(1L);
		drinkEntityFromMockWithId.setName("black coffee");
		drinkEntityFromMockWithId.setSize("XL");
		drinkEntityFromMockWithId.setMilligramsCaffeine(80);
		drinkEntityFromMockWithId.setGramsSugar(0);
		return drinkEntityFromMockWithId;
	}
	
	@Bean("drinkDtoFromMockWithId")
	public DrinkDTO drinkDtoFromMockWithId() {
		DrinkDTO drinkDtoFromMockWithId = new DrinkDTO();
		drinkDtoFromMockWithId.setId(1L);
		drinkDtoFromMockWithId.setName("black coffee");
		drinkDtoFromMockWithId.setSize("XL");
		drinkDtoFromMockWithId.setMilligramsCaffeine(80);
		drinkDtoFromMockWithId.setGramsSugar(0);
		return drinkDtoFromMockWithId;
	}
	
}
