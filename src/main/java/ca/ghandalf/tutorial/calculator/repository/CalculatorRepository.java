package ca.ghandalf.tutorial.calculator.repository;

import ca.ghandalf.tutorial.calculator.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRepository extends JpaRepository<Item, Long> {

}
