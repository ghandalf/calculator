package ca.ghandalf.tutorial.calculator.service;

import ca.ghandalf.tutorial.calculator.domain.entity.Item;

import java.util.List;

public interface CalculatorService {

	Item create(Item item);

	Item read(Long id);

	Item update(Item item);

	void delete(Item item);
	
	List<Item> findAll();
	
}
