package com.prasan.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticOperatorFactory {
	private static Map<Character, ArithmeticOperator> cache=new HashMap<Character, ArithmeticOperator>();
	
	public static ArithmeticOperator createOperator(char operator)
	{
		ArithmeticOperator arithmeticOperator=null;
		if(cache.containsKey(operator)){
			arithmeticOperator=cache.get(operator);
		}
		else{
			arithmeticOperator=new ArithmeticOperator(operator);
			cache.put(operator, arithmeticOperator);
		}
		return arithmeticOperator;
	}
}