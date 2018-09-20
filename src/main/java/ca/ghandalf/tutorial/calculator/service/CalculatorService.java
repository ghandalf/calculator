package ca.ghandalf.tutorial.calculator.service;

import java.util.List;

import ca.ghandalf.tutorial.calculator.domain.entity.Item;

public interface CalculatorService {

	public Item create(Item item);

	public Item read(Long id);

	public Item update(Item item);

	public void delete(Item item);
	
	public List<Item> findAll();
	
}
