package org.google;

public class Prime {
public static void main(String[] args) {
	int number = 15;
	boolean isPrime = true;
	if (number <= 1) {
		isPrime = false;
	}else {
		for (int i = 2; i <= number/2; i++) {
			if (number%i==0) {
				isPrime=false;
				break;
			}
		}
	}
	if (isPrime) {
		System.out.println("The number is Prime number");
	} else {
		System.out.println("The number is not Prime number");
	}
}
}
