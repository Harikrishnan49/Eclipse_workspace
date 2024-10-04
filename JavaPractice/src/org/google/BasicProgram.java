package org.google;

import java.util.Scanner;

public class BasicProgram {
public static void main (String[] args) {
	int number = 5;
	int factorial =1;
	for (int i = 1; i <=number; i++) {
		factorial*=i;
		System.out.println("The factorial of the number is: "+ factorial);
	}
}
}
