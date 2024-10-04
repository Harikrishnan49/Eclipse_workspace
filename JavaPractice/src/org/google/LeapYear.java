package org.google;

public class LeapYear {
	int year = 2000;
	boolean leap = false;
	public void leap() {
		if (year%4==0) {
			if (year%100==0) 
				if (year%400==0) {
					leap = true;
				}else {
					leap = false;
				}else {
					leap = true;
				}
			}else {
				leap = false;
			}
		if (leap) {
			System.out.println("The year is leap year");
		}else {
			System.out.println("The year is not leap");
		}
		}
	
public static void main(String[] args) {
	LeapYear lp = new  LeapYear();
	lp.leap();
}
}
