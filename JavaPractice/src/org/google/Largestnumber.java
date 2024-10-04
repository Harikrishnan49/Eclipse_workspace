package org.google;

public class Largestnumber {
	int a=3;
	int b=4;
	int c=5;
	public void largerst() {
		if (a>b&&a>c) {
			System.out.println("The number a is largest");
		} else if (b>c&&b>a) {
			System.out.println("The number b is largest");
		} else if (c>a&&c>b) {
			System.out.println("The number c is largest");
		}
		else {
			System.out.println("The number is incorrect");
		}
		}
	
	public static void main(String[] args) {
		Largestnumber ln = new Largestnumber();
		ln.largerst();
	}
}
