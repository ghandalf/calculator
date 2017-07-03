package ca.ghandalf.tutorial.calculator.utils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages={"ca.ghandalf.tutorial.calculator"})
public class OperationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(OperationTest.class);

	@Test
	public void getPlus() {
		Operation actual = Operation.MINUS.instance("pluS");
		Operation expected = Operation.PLUS;
		
		LOGGER.info("Result: " + actual.name());
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void getMinus() {
		Operation actual = Operation.PLUS.instance("MinUS");
		Operation expected = Operation.MINUS;
		
		LOGGER.info("Result: " + actual.name());
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getMultiply() {
		Operation actual = Operation.DIVIDE.instance("MuLTiPlY");
		Operation expected = Operation.MULTIPLY;
		
		LOGGER.info("Result: " + actual.name());
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getDivide() {
		Operation actual = Operation.MULTIPLY.instance("DiViDe");
		Operation expected = Operation.DIVIDE;
		
		LOGGER.info("Result: " + actual.name());
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void operationPlus() {
		double actual = Operation.PLUS.applyAsDouble(1, 2);
		double expected = 3;
		double delta = 0;
		
		LOGGER.info("Result: " + actual);
		
		Assert.assertEquals(expected, actual, delta);
	}

	@Test
	public void operationMinus() {
		double actual = Operation.MINUS.applyAsDouble(1, 2);
		double expected = -1;
		double delta = 0;
		
		LOGGER.info("Result: " + actual);
		
		Assert.assertEquals(expected, actual, delta);
	}

	@Test
	public void operationMultiply() {
		double actual = Operation.MULTIPLY.applyAsDouble(1, 2);
		double expected = 2;
		double delta = 0;
		
		LOGGER.info("Result: " + actual);
		
		Assert.assertEquals(expected, actual, delta);
	}
	
	@Test
	public void operationDivide() {
		double actual = Operation.DIVIDE.applyAsDouble(1, 2);
		double expected = .5;
		double delta = 0;
		
		LOGGER.info("Result: " + actual);
		
		Assert.assertEquals(expected, actual, delta);
	}
}
