package org.aerospace.training.coffee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import org.aerospace.training.coffee.config.DrinkTestConfiguration;
import org.aerospace.training.coffee.dto.DrinkDTO;
import org.aerospace.training.coffee.repository.DrinkRepository;
import org.aerospace.training.coffee.repository.entity.DrinkEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@Import(DrinkTestConfiguration.class)
class DrinkServiceImplTest {
	
	@MockBean
	private DrinkRepository mockDrinkRepository;
	@MockBean
	private DrinkMapper mockDrinkMapper;
	
	@Autowired
	@InjectMocks
	private DrinkServiceImpl drinkServiceImplUnderTest;
	
	@Autowired
	@Qualifier("blackCoffeeDrinkDtoNoId")
	private DrinkDTO blackCoffeeDrinkDtoNoId;
	@Autowired
	@Qualifier("drinkEntityFromMockNoId")
	private DrinkEntity drinkEntityFromMockNoId;
	@Autowired
	@Qualifier("drinkEntityFromMockWithId")
	private DrinkEntity drinkEntityFromMockWithId;
	@Autowired
	@Qualifier("drinkDtoFromMockWithId")
	private DrinkDTO drinkDtoFromMockWithId;
	
	@Test
	void testSave() {
		when(mockDrinkMapper.toEntity(blackCoffeeDrinkDtoNoId)).thenReturn(drinkEntityFromMockNoId);
		when(mockDrinkRepository.save(drinkEntityFromMockNoId)).thenReturn(drinkEntityFromMockWithId);
		when(mockDrinkMapper.toDto(drinkEntityFromMockWithId)).thenReturn(drinkDtoFromMockWithId);
		DrinkDTO actual = drinkServiceImplUnderTest.save(blackCoffeeDrinkDtoNoId);
		assertEquals(drinkDtoFromMockWithId, actual);
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAllDrinks() {
		fail("Not yet implemented");
	}

}
