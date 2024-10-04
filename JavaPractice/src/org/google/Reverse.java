package org.google;

public class Reverse {
public static void main(String[] args) {
	int number = 1221;
	int rem =0;
	int palindrome = number;
	while(number!=0) {
		rem= rem*10+number%10;
		number = number/10;
	}
	System.out.println("The reversed number is "+ rem);
	if (palindrome==rem) {
		System.out.println("The number is palindrome");
	} else {
		System.out.println("Not a palindrome");
	}
}
}
