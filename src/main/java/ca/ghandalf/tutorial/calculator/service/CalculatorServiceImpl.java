package ca.ghandalf.tutorial.calculator.service;

import ca.ghandalf.tutorial.calculator.domain.entity.Item;
import ca.ghandalf.tutorial.calculator.repository.CalculatorRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Inject
	private CalculatorRepository calculatorRepository;
	
	@Override
	public Item create(Item item) {
		return this.calculatorRepository.save(item);
	}

	@Override
	public Item read(Long id) {
		return this.calculatorRepository.getOne(id);
	}

	@Override
	public Item update(Item item) {
		return this.calculatorRepository.saveAndFlush(item);
	}

	@Override
	public void delete(Item item) {
		this.calculatorRepository.delete(item);
	}

	@Override
	public List<Item> findAll() {
		return this.calculatorRepository.findAll();
	}
}
