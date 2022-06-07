package org.aerospace.training.coffee.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.aerospace.training.coffee.dto.DrinkDTO;
import org.aerospace.training.coffee.repository.DrinkRepository;
import org.aerospace.training.coffee.repository.entity.DrinkEntity;
import org.aerospace.training.coffee.service.exception.DrinkNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkServiceImpl implements DrinkService {

	@Autowired
	private DrinkRepository drinkRepository;
	@Autowired
	private DrinkMapper mapper;
	
	@Override
	public DrinkDTO save(DrinkDTO drinkDto) {
		DrinkEntity entityToSave = mapper.toEntity(drinkDto);
		DrinkEntity entitySaved = drinkRepository.save(entityToSave);
		return mapper.toDto(entitySaved);
	}

	@Override
	public DrinkDTO findById(Long id) {
		Optional<DrinkEntity> optionalFoundEntity = drinkRepository.findById(id);
		DrinkEntity foundDrinkEntity = optionalFoundEntity.orElseThrow(DrinkNotFoundException::new);
		return mapper.toDto(foundDrinkEntity);
	}

	@Override
	public List<DrinkDTO> findAllDrinks() {
		List<DrinkEntity> allDrinkEntities = (List<DrinkEntity>) drinkRepository.findAll();
		return allDrinkEntities.stream()
				.map(mapper::toDto)
				.collect(Collectors.toList());
	}

}
