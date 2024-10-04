package org.google;

import java.util.Scanner;

public class Fibanocci {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the First number");
	int f=s.nextInt();
	System.out.println("Enter the Second number");
	int se= s.nextInt();
	int t;
	for (int i = 0; i < 10; i++) {
		t=f+se;
		f=se;
		se=t;
		System.out.println("The number is: "+ t);
	}
//	int f = 0;
//	int s = 1;
//	int t;
//	for (int i = 0; i <=16; i++) {
//		System.out.println("The fibanocci number is "+ f);
//		t=f+s; 
//		f=s;
//		s=t;
//	}
}
}
