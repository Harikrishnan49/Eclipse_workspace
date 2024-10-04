package org.google;

public class Factorial {
public static void main(String[] args) {
	int n=5;
	int fact=1;
	while (n>0) {
		fact= fact*n;
		n--;
	}
	System.out.println("The factorial of the number is "+ fact);

}
}
