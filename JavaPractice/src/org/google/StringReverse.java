package org.google;

public class StringReverse {
	public static void main(String[] args) {
		String before = "Harikrishnan";
		String s = new StringBuilder(before).reverse().toString();
		System.out.println("The reverse of the name is "+ s);
	}
}
