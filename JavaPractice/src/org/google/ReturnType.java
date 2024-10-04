package org.google;

public class ReturnType {
int number = 12345;
public int getNumber() {
	System.out.println("The number is "+ number);
	return number;
}
	public static void main (String[] args) {
		ReturnType returnType = new ReturnType();
		returnType.getNumber();
		
	}
}
