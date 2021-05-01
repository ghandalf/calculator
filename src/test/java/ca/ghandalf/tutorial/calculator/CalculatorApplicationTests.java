package ca.ghandalf.tutorial.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class CalculatorApplicationTests extends AbstractTestNGSpringContextTests {

	private static final Logger logger = LoggerFactory.getLogger(CalculatorApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Context loaded...");
	}

}
