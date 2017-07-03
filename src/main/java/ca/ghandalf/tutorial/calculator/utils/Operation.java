package ca.ghandalf.tutorial.calculator.utils;

import java.util.function.DoubleBinaryOperator;

import javax.ws.rs.Produces;

@Produces
public enum Operation implements DoubleBinaryOperator {
	PLUS("+", (l, r) -> l + r), 
	MINUS("-", (l, r) -> l - r), 
	MULTIPLY("*", (l, r) -> l * r), 
	DIVIDE("/",	(l, r) -> l / r);

	private final String which;
	private final DoubleBinaryOperator operator;

	private Operation(final String which, final DoubleBinaryOperator operator) {
		this.which = which;
		this.operator = operator;
	}

	public Operation instance(String operation) {
		String value = operation.toUpperCase();
		switch (value) {
			case "PLUS": return PLUS;
			case "MINUS": return MINUS;
			case "MULTIPLY": return MULTIPLY;
			case "DIVIDE": return DIVIDE;
			default: return PLUS;
		}
	}

	public String getWhich() {
		return this.which;
	}

	@Override
	public double applyAsDouble(final double left, final double right) {
		return operator.applyAsDouble(left, right);
	}
}