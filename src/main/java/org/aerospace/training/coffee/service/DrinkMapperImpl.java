package org.aerospace.training.coffee.service;

import org.aerospace.training.coffee.dto.DrinkDTO;
import org.aerospace.training.coffee.repository.entity.DrinkEntity;
import org.springframework.stereotype.Component;

@Component
public class DrinkMapperImpl implements DrinkMapper {

	@Override
	public DrinkEntity toEntity(DrinkDTO drinkDto) {
		DrinkEntity drinkEntity = new DrinkEntity();
		drinkEntity.setId(drinkDto.getId());
		drinkEntity.setName(drinkDto.getName());
		drinkEntity.setSize(drinkDto.getSize());
		drinkEntity.setMilligramsCaffeine(drinkDto.getMilligramsCaffeine());
		drinkEntity.setGramsSugar(drinkDto.getGramsSugar());
		return drinkEntity;
	}

	@Override
	public DrinkDTO toDto(DrinkEntity drinkEntity) {
		DrinkDTO drinkDto = new DrinkDTO();
		drinkDto.setId(drinkEntity.getId());
		drinkDto.setName(drinkEntity.getName());
		drinkDto.setSize(drinkEntity.getSize());
		drinkDto.setMilligramsCaffeine(drinkEntity.getMilligramsCaffeine());
		drinkDto.setGramsSugar(drinkEntity.getGramsSugar());
		return drinkDto;
	}

}
