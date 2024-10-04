package org.google;

public class ConditionAndLooping {
	int i = 3;
	public void evenOrOdd() {
		if (i%2==0) {
			System.out.println("The given number is Even");
		}else {
			System.out.println("The given number is Odd");
		}
	}
	public static void main (String[] args) {
		ConditionAndLooping cl = new ConditionAndLooping();
		cl.evenOrOdd();
	}

}
