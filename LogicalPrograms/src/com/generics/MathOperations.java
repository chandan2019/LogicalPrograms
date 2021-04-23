package com.generics;

public class MathOperations {

	public <T extends Number> T findMax(T a, T b) {

		return (a.intValue() > b.intValue() ? a : b);

	}
	
	public <T extends String> T findMax(T a, T b) {

		return a.compareTo(b) > 0 ? a : b;

	}
	
	

	public <T extends Number> T add(T a, T b) {

		Integer intSum = null;
		Double dbSum = null;
		if (a.getClass() == Integer.class) {
			int intValue = a.intValue();
			int intValue2 = b.intValue();
			int sum = intValue + intValue2;
			intSum = new Integer(sum);
			return (T) intSum;
		} else if (a.getClass() == Double.class) {

			double intValue = a.doubleValue();
			double intValue2 = b.doubleValue();
			double sum = intValue + intValue2;
			dbSum = new Double(sum);
			return (T) dbSum;
		}
		return null;

	}

	

}
