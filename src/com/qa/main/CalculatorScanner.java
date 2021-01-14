package com.qa.main;

import java.util.Scanner;

public class CalculatorScanner {
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		//operation scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an operation (+,-,*,/): ");
		String op=scan.next();
		
		switch(op) {
		case "+": 
			System.out.println("You chose addition.");
			break;
		case "-": 
			System.out.println("You chose subtraction.");
			break;
		case "*": 
			System.out.println("You chose multiplication.");
			break;
		case "/": 
			System.out.println("You chose division.");
			break;
		}
		//num scanners
		System.out.println("Enter left value: ");
		double num1=Double.parseDouble(scan.next());
	
		System.out.println("Enter right value: ");
		double  num2=Double.parseDouble(scan.next());
		scan.close();
		switch(op) {
		case "+": 
			System.out.println("Sum: "+c.add(num1,num2));
			break;
		case "-": 
			System.out.println("Difference: "+c.sub(num1,num2));
			break;
		case "*": 
			System.out.println("Product: "+c.mult(num1, num2));
			break;
		case "/": 
			System.out.println("Quotient: "+c.div(num1, num2));
			break;}
	}
}
