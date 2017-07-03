package ca.ghandalf.tutorial.calculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.ghandalf.tutorial.calculator.domain.entity.Item;

@Repository
public interface CalculatorRepository extends JpaRepository<Item, Long> {

}
