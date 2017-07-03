package ca.ghandalf.tutorial.calculator.service;

import java.util.List;

import ca.ghandalf.tutorial.calculator.domain.entity.Item;

public interface CalculatorService {

	public void create(Item calculator);

	public Item read(Long id);

	public Item update(Item calculator);

	public void delete(Item calculator);
	
	public List<Item> findAll();
	
}
