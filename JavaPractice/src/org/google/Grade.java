package org.google;

public class Grade {
	int i=56;
	public void mark() {
	if (i>=90) {
		System.out.println("The Grade is A");
	}else if (i>=80) {
		System.out.println("The Grade is B");
	}else if (i>=70) {
		System.out.println("The Grade is C");
	}else if (i>=60) {
		System.out.println("The Grade is D");
	}else {
		System.out.println("The Grade is F");
	}
	}
public static void main(String[] args) {
	Grade g = new Grade();
	g.mark();
}
}
