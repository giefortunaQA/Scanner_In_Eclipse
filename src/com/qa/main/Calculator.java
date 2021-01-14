package com.qa.main;


public class Calculator{
	
	//1. Addition method
	public double add(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}
	
	//2. Mult/Sub/Div methods
	
	public double mult(double num1, double num2) {
		double product= num1*num2;
		return product;
	}
	
	public double sub(double num1, double num2) {
		double difference=num1-num2;
		return difference;
	}
	
	public double div(double num1, double num2) {
		double quotient= num1/num2;
		return quotient;
	}

	//3. Oops I already used double :)
	
}
