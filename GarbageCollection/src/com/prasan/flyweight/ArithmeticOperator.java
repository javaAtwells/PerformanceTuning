package com.prasan.flyweight;

public class ArithmeticOperator {
	private char operator;

	public ArithmeticOperator(char operator) {
		super();
		this.operator = operator;
	}
	
	public int performOperation(int operand1,int operand2)
	{
		int result=0;
		switch (operator) {
		case '+':
			result=operand1+operand2;
			break;
		case '-':
			result=operand1-operand2;
			break;
		case '*':
			result=operand1*operand2;
			break;
		case '/':
			result=operand1/operand2;
			break;
			

		default:
			break;
		}
		return result;
	}

}
