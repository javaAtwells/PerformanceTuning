package com.prasan.flyweight;

public class FlyWeightTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperator op1 = ArithmeticOperatorFactory.createOperator('+');
		System.out.println(op1.performOperation(10, 20));
		ArithmeticOperator op2 = ArithmeticOperatorFactory.createOperator('*');
		System.out.println(op2.performOperation(5, 10));
		ArithmeticOperator op3 = ArithmeticOperatorFactory.createOperator('+');
		System.out.println(op3.performOperation(7, 8));

		System.out.println(op1 == op2);
		System.out.println(op1 == op3);

	}

}
