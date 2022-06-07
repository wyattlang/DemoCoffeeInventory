package org.aerospace.training.coffee.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.aerospace.training.coffee.dto.DrinkDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(OrderAnnotation.class)
class DrinkControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper mapper;

	private DrinkDTO blackCoffeeDrinkDto;
	private String drinkAsJson;
	
	@BeforeEach
	void setUp() throws JsonProcessingException {
		blackCoffeeDrinkDto = new DrinkDTO();
		blackCoffeeDrinkDto.setId(1L);
		blackCoffeeDrinkDto.setName("black coffee");
		blackCoffeeDrinkDto.setSize("XL");
		blackCoffeeDrinkDto.setMilligramsCaffeine(80);
		blackCoffeeDrinkDto.setGramsSugar(0);
		this.drinkAsJson = mapper.writeValueAsString(blackCoffeeDrinkDto);
	}
	
	@Test
	@Order(1)
	void testPostDrink() throws Exception {
		mockMvc.perform(post("/drink").contentType(MediaType.APPLICATION_JSON).content(drinkAsJson))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().json(drinkAsJson));
	}

	@Test
	@Order(2)
	void testGetDrink() throws Exception {
		mockMvc.perform(get("/drink/1"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().json(drinkAsJson));
	}
	
	@Test
	@Order(3)
	void testGetAllDrinks() throws Exception {
		List<DrinkDTO> allDrinks = new ArrayList<>();
		allDrinks.add(blackCoffeeDrinkDto);
		String allDrinksAsJson = mapper.writeValueAsString(allDrinks);
		
		mockMvc.perform(get("/drink"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().json(allDrinksAsJson));
	}

}
