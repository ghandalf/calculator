package ca.ghandalf.tutorial.calculator.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ca.ghandalf.tutorial.calculator.domain.entity.Item;
import ca.ghandalf.tutorial.calculator.repository.CalculatorRepository;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Inject
	private CalculatorRepository calculatorRepository;
	
	@Override
	public void create(Item calculator) {
		this.calculatorRepository.save(calculator);
	}

	@Override
	public Item read(Long id) {
		return this.calculatorRepository.getOne(id);
	}

	@Override
	public Item update(Item calculator) {
		return this.calculatorRepository.saveAndFlush(calculator);
	}

	@Override
	public void delete(Item calculator) {
		this.calculatorRepository.delete(calculator);
	}

	@Override
	public List<Item> findAll() {
		return this.calculatorRepository.findAll();
	}

	
}
