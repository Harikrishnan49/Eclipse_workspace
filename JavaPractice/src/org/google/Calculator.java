package org.google;

public class Calculator {
	int a = 2;
	int b = 3;
	int operators;
	public void numbers() {
		switch (operators) {
		case '+': {
			operators = a+b;
			System.out.println("The Addition of the numbers"+ operators);
			break;
		}
		case '-': {
			operators = a-b;
			System.out.println("The Subtraction of the numbers"+ operators);
		}
		case '*': {
			operators = a*b;
			System.out.println("The Multiply of the numbers"+ operators);
		}
		case '/': {
			operators = a/b;
			System.out.println("The Division of the numbers"+ operators);
		}
		default:
			System.out.println("Invalid");
		}
	}
public static void main(String[] args) {
Calculator c = new Calculator();
c.numbers();
}
}
